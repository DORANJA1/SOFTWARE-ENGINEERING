
public class URLAnalyzer_answer {
	
	private String url;
	private String domain;
	private URLParameter[] urlParamArr;
	
	// 기본생성자
	public URLAnalyzer_answer() 
	{
		url = null;
		domain = null;
		urlParamArr = null;
	}
	
	// 오버로딩된 생성자
	public URLAnalyzer_answer(String url) 
	{
		this.url = url;
		domain = null;
		urlParamArr = null;
	}
	
	// 초기 셋팅 설정 함수
	public boolean initialization()
	{	
		setUrlParamArr();
		
		return true;
	}
	
	///////////////////////////////////////////
	
	// domain get
	public String getDomain()
	{
		// ["https:", "", "www.naver.com", "index.html?id=admin&pw=1234"]
		String[] domainCutting = url.split("/");
		domain = domainCutting[2];
		return domain;
	}
	
	// parameter count get
	public int getParamCount()
	{
		int count = 0;
		
		// "?"가 없어 결국 아무일도 일어나지 않은 경우 ==> 파라미터가 없다.
		if(url.split("\\?").length == 1)
		{
			return 0;
		}
		
		// ["https://www.naver.com/index.html", "id=admin&pw=1234"]
		String paramCutting = url.split("\\?")[1];
		
		// ["id=admin", "pw=1234"]
		String[] paramsArr = paramCutting.split("&");
		
		count = paramsArr.length;
		
		return count;
	}
	
	// parameter arr setting
	public void setUrlParamArr()
	{
		if(getParamCount() != 0)
		{
			urlParamArr = new URLParameter[getParamCount()];
			
			// ["https://www.naver.com/index.html", "id=admin&pw=1234"]
			String paramCutting = url.split("\\?")[1];
			
			// ["id=admin", "pw=1234"]
			String[] paramsArr = paramCutting.split("&");
			
			String[] keyValue;	// key와 value값을 담을 배열
			
			for(int i = 0; i < urlParamArr.length; i++)
			{
				keyValue = paramsArr[i].split("=");	// ["id", "value"]
				
				urlParamArr[i] = new URLParameter();
				urlParamArr[i].key = keyValue[0];
				urlParamArr[i].value = keyValue[1];
			}
		}
	}
	
	// param get
	public URLParameter getParam(int index)
	{
		// 가지고 있는 파라미터개수보다 더 큰 index값 받은 경우 null로 가드코드 
		if(index >= getParamCount())
		{
			return null;
		}
		
		return urlParamArr[index];
	}
	
	
}
