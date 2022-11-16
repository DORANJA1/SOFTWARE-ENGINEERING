
 
    const userInfo=[
        {
            name: '임꺽정',
            age: 50,
            addr: '충북'
        },
        {
            name: '이순신',
            age: 60,
            addr: '전남'
        },
        {
            name: '정성훈',
            age: 49,
            addr: '서울'
        },
        {
            name: '전경민',
            age: 27,
            addr: '군포'
        },
        {
            name: '박수현',
            age: 26,
            addr: '인천'
        },
        {
            name: '곽승훈',
            age: 28,
            addr: '스울'
        }
    ];


    const userInfo2=[
        {
            name: '임꺽정',
            age: 50,
            addr: '충북'
        },
        {
            name: '이순신',
            age: 60,
            addr: '전남'
        },
        {
            name: '정성훈',
            age: 49,
            addr: '서울'
        },
        {
            name: '전경민',
            age: 27,
            addr: '군포'
        },
        {
            name: '박수현',
            age: 26,
            addr: '인천'
        },
        {
            name: '곽승훈',
            age: 28,
            addr: '스울'
        }
    ];

    const userInfo3=[
        {
            name: '임꺽정',
            age: 50,
            addr: '충북'
        },
        {
            name: '이순신',
            age: 60,
            addr: '전남'
        },
        {
            name: '정성훈',
            age: 49,
            addr: '서울'
        },
        {
            name: '전경민',
            age: 27,
            addr: '군포'
        },
        {
            name: '박수현',
            age: 26,
            addr: '인천'
        },
        {
            name: '곽승훈',
            age: 28,
            addr: '스울'
        }
    ];

    const userInfo4=[
        {
            name: '임꺽정',
            age: 50,
            addr: '충북'
        },
        {
            name: '이순신',
            age: 60,
            addr: '전남'
        },
        {
            name: '정성훈',
            age: 49,
            addr: '서울'
        },
        {
            name: '전경민',
            age: 27,
            addr: '군포'
        },
        {
            name: '박수현',
            age: 26,
            addr: '인천'
        },
        {
            name: '곽승훈',
            age: 28,
            addr: '스울'
        }
    ];
    
    const ans = userInfo.sort(function(a,b){
        if(a.age>b.age){
            return 1;
        }else{
            return -1;
        }
    })


    const alterAns = userInfo2.sort(function(a,b){
        if(a.age<b.age){
            return 1;
        }else{
            return -1;
        }
    })
    
    const forjun = userInfo3.sort(function(a,b){

        
       
        if(b.name=='전경민'){
            return 1;
        }else


        
        if(a.age>b.age){
            return 1;
        }else{
            return -1;
        }
        
    })

    const forju = userInfo4.sort(function(a,b){

        
        if(a.name=='전경민'){
            return 1;
        }else


        
        if(a.age>b.age){
            return 1;
        }else{
            return -1;
        }
        

    })

    const numBer=[233,12,5,7,44,99,99];

    const compare = function(a,b){

        if(a===99&&b===99){
            return 0;
        }else
        if(a!==99&&b===99){
            return 1;
        }else if(a===99&&b!==99){
            return -1;
        }else{
            return a-b;
        }
    }

    numBer.sort(compare);

