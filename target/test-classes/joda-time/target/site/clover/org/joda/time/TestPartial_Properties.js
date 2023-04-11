var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":503,"id":51109,"methods":[{"el":118,"sc":5,"sl":65},{"el":135,"sc":5,"sl":131},{"el":141,"sc":5,"sl":137},{"el":162,"sc":5,"sl":144},{"el":171,"sc":5,"sl":164},{"el":224,"sc":5,"sl":195},{"el":241,"sc":5,"sl":226},{"el":260,"sc":5,"sl":243},{"el":268,"sc":5,"sl":262},{"el":276,"sc":5,"sl":270},{"el":284,"sc":5,"sl":278},{"el":309,"sc":5,"sl":286},{"el":330,"sc":5,"sl":312},{"el":339,"sc":5,"sl":332},{"el":428,"sc":5,"sl":381},{"el":442,"sc":5,"sl":430},{"el":461,"sc":5,"sl":444},{"el":469,"sc":5,"sl":463},{"el":494,"sc":5,"sl":471},{"el":502,"sc":5,"sl":497}],"name":"TestPartial_Properties","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1039":{"methods":[{"sl":144}],"name":"testPropertyGetHour","pass":true,"statements":[{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161}]},"test_1043":{"methods":[{"sl":471}],"name":"testPropertyCompareToMinute","pass":true,"statements":[{"sl":473},{"sl":474},{"sl":475},{"sl":476},{"sl":477},{"sl":478},{"sl":479},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":488},{"sl":489},{"sl":490}]},"test_1526":{"methods":[{"sl":164}],"name":"testPropertyGetMaxMinValuesHour","pass":true,"statements":[{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170}]},"test_1742":{"methods":[{"sl":286}],"name":"testPropertyCompareToHour","pass":true,"statements":[{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":299},{"sl":300},{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":305}]},"test_183":{"methods":[{"sl":278},{"sl":497}],"name":"testPropertyWithMinimumValueHour","pass":true,"statements":[{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_1993":{"methods":[{"sl":430},{"sl":497}],"name":"testPropertyAddWrapFieldMinute","pass":true,"statements":[{"sl":432},{"sl":433},{"sl":434},{"sl":435},{"sl":437},{"sl":438},{"sl":440},{"sl":441},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_235":{"methods":[{"sl":226},{"sl":497}],"name":"testPropertyAddWrapFieldHour","pass":true,"statements":[{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":233},{"sl":234},{"sl":236},{"sl":237},{"sl":239},{"sl":240},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_245":{"methods":[{"sl":195},{"sl":497}],"name":"testPropertyAddHour","pass":true,"statements":[{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":202},{"sl":203},{"sl":205},{"sl":206},{"sl":208},{"sl":209},{"sl":213},{"sl":215},{"sl":216},{"sl":218},{"sl":219},{"sl":223},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_2685":{"methods":[{"sl":243},{"sl":497}],"name":"testPropertySetHour","pass":true,"statements":[{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":250},{"sl":251},{"sl":255},{"sl":256},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_2982":{"methods":[{"sl":381},{"sl":497}],"name":"testPropertyAddMinute","pass":true,"statements":[{"sl":383},{"sl":384},{"sl":385},{"sl":386},{"sl":388},{"sl":389},{"sl":391},{"sl":392},{"sl":394},{"sl":395},{"sl":397},{"sl":398},{"sl":400},{"sl":401},{"sl":405},{"sl":407},{"sl":408},{"sl":410},{"sl":411},{"sl":413},{"sl":414},{"sl":416},{"sl":417},{"sl":419},{"sl":420},{"sl":422},{"sl":423},{"sl":427},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_2986":{"methods":[{"sl":312}],"name":"testPropertyGetMinute","pass":true,"statements":[{"sl":314},{"sl":315},{"sl":316},{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":321},{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329}]},"test_342":{"methods":[{"sl":262},{"sl":497}],"name":"testPropertySetTextHour","pass":true,"statements":[{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_3714":{"methods":[{"sl":332}],"name":"testPropertyGetMaxMinValuesMinute","pass":true,"statements":[{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338}]},"test_3948":{"methods":[{"sl":444},{"sl":497}],"name":"testPropertySetMinute","pass":true,"statements":[{"sl":446},{"sl":447},{"sl":448},{"sl":449},{"sl":451},{"sl":452},{"sl":456},{"sl":457},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_4057":{"methods":[{"sl":463},{"sl":497}],"name":"testPropertySetTextMinute","pass":true,"statements":[{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]},"test_961":{"methods":[{"sl":270},{"sl":497}],"name":"testPropertyWithMaximumValueHour","pass":true,"statements":[{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":498},{"sl":499},{"sl":500},{"sl":501}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1039], [], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [1039], [], [], [1526], [], [1526], [1526], [1526], [1526], [1526], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [245], [], [245], [245], [245], [245], [], [245], [245], [], [245], [245], [], [245], [245], [], [], [], [245], [], [245], [245], [], [245], [245], [], [], [], [245], [], [], [235], [], [235], [235], [235], [235], [], [235], [235], [], [235], [235], [], [235], [235], [], [], [2685], [], [2685], [2685], [2685], [2685], [], [2685], [2685], [], [], [], [2685], [2685], [], [], [], [], [], [342], [], [342], [342], [342], [342], [], [], [961], [], [961], [961], [961], [961], [], [], [183], [], [183], [183], [183], [183], [], [], [1742], [], [1742], [1742], [1742], [1742], [1742], [1742], [1742], [], [], [], [], [1742], [1742], [1742], [1742], [1742], [1742], [1742], [], [], [], [], [], [], [2986], [], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [2986], [], [], [3714], [], [3714], [3714], [3714], [3714], [3714], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2982], [], [2982], [2982], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [], [], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [2982], [2982], [], [], [], [2982], [], [], [1993], [], [1993], [1993], [1993], [1993], [], [1993], [1993], [], [1993], [1993], [], [], [3948], [], [3948], [3948], [3948], [3948], [], [3948], [3948], [], [], [], [3948], [3948], [], [], [], [], [], [4057], [], [4057], [4057], [4057], [4057], [], [], [1043], [], [1043], [1043], [1043], [1043], [1043], [1043], [1043], [], [], [], [], [1043], [1043], [1043], [1043], [1043], [1043], [1043], [], [], [], [], [], [], [4057, 961, 245, 342, 3948, 183, 1993, 2982, 2685, 235], [4057, 961, 245, 342, 3948, 183, 1993, 2982, 2685, 235], [4057, 961, 245, 342, 3948, 183, 1993, 2982, 2685, 235], [4057, 961, 245, 342, 3948, 183, 1993, 2982, 2685, 235], [4057, 961, 245, 342, 3948, 183, 1993, 2982, 2685, 235], [], []]