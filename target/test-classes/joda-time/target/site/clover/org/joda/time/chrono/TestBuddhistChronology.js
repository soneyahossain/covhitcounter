var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":491,"id":60285,"methods":[{"el":130,"sc":5,"sl":66},{"el":150,"sc":5,"sl":141},{"el":161,"sc":5,"sl":152},{"el":170,"sc":5,"sl":166},{"el":177,"sc":5,"sl":173},{"el":186,"sc":5,"sl":180},{"el":197,"sc":5,"sl":190},{"el":206,"sc":5,"sl":200},{"el":217,"sc":5,"sl":209},{"el":226,"sc":5,"sl":220},{"el":296,"sc":5,"sl":229},{"el":353,"sc":5,"sl":299},{"el":382,"sc":5,"sl":356},{"el":390,"sc":5,"sl":386},{"el":400,"sc":5,"sl":392},{"el":446,"sc":5,"sl":403},{"el":489,"sc":5,"sl":449}],"name":"TestBuddhistChronology","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1801":{"methods":[{"sl":190}],"name":"testEquality","pass":true,"statements":[{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196}]},"test_1928":{"methods":[{"sl":180}],"name":"testFactory_Zone","pass":true,"statements":[{"sl":182},{"sl":183},{"sl":184},{"sl":185}]},"test_2252":{"methods":[{"sl":209}],"name":"testWithZone","pass":true,"statements":[{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":216}]},"test_2267":{"methods":[{"sl":220}],"name":"testToString","pass":true,"statements":[{"sl":222},{"sl":223},{"sl":224},{"sl":225}]},"test_2704":{"methods":[{"sl":392}],"name":"testEra","pass":true,"statements":[{"sl":394},{"sl":395},{"sl":396}]},"test_2876":{"methods":[{"sl":403}],"name":"testKeyYears","pass":true,"statements":[{"sl":405},{"sl":406},{"sl":407},{"sl":408},{"sl":409},{"sl":410},{"sl":412},{"sl":413},{"sl":414},{"sl":415},{"sl":416},{"sl":417},{"sl":419},{"sl":420},{"sl":421},{"sl":422},{"sl":423},{"sl":424},{"sl":426},{"sl":427},{"sl":428},{"sl":429},{"sl":430},{"sl":431},{"sl":433},{"sl":434},{"sl":435},{"sl":436},{"sl":437},{"sl":438},{"sl":440},{"sl":441},{"sl":442},{"sl":443},{"sl":444},{"sl":445}]},"test_2906":{"methods":[{"sl":356}],"name":"testTimeFields","pass":true,"statements":[{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":365},{"sl":366},{"sl":367},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":373},{"sl":374},{"sl":375},{"sl":376},{"sl":377},{"sl":378},{"sl":379},{"sl":380},{"sl":381}]},"test_2993":{"methods":[{"sl":173}],"name":"testFactory","pass":true,"statements":[{"sl":175},{"sl":176}]},"test_3502":{"methods":[{"sl":449}],"name":"testCalendar","pass":true,"statements":[{"sl":451},{"sl":454},{"sl":455},{"sl":456},{"sl":457},{"sl":458},{"sl":459},{"sl":460},{"sl":461},{"sl":462},{"sl":463},{"sl":464},{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":474},{"sl":475},{"sl":476},{"sl":477},{"sl":478},{"sl":479},{"sl":480},{"sl":481},{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487}]},"test_3589":{"methods":[{"sl":229}],"name":"testDurationFields","pass":true,"statements":[{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":237},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254},{"sl":255},{"sl":256},{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":270},{"sl":271},{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278},{"sl":279},{"sl":280},{"sl":281},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287},{"sl":288},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295}]},"test_3659":{"methods":[{"sl":299}],"name":"testDateFields","pass":true,"statements":[{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":307},{"sl":308},{"sl":309},{"sl":310},{"sl":311},{"sl":312},{"sl":313},{"sl":315},{"sl":316},{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":321},{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":341},{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":351},{"sl":352}]},"test_3787":{"methods":[{"sl":386}],"name":"testEpoch","pass":true,"statements":[{"sl":388},{"sl":389}]},"test_3918":{"methods":[{"sl":166}],"name":"testFactoryUTC","pass":true,"statements":[{"sl":168},{"sl":169}]},"test_3956":{"methods":[{"sl":200}],"name":"testWithUTC","pass":true,"statements":[{"sl":202},{"sl":203},{"sl":204},{"sl":205}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3918], [], [3918], [3918], [], [], [], [2993], [], [2993], [2993], [], [], [], [1928], [], [1928], [1928], [1928], [1928], [], [], [], [], [1801], [], [1801], [1801], [1801], [1801], [1801], [], [], [], [3956], [], [3956], [3956], [3956], [3956], [], [], [], [2252], [], [2252], [2252], [2252], [2252], [2252], [2252], [], [], [], [2267], [], [2267], [2267], [2267], [2267], [], [], [], [3589], [], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [3589], [], [], [], [3659], [], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [3659], [], [], [], [2906], [], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [2906], [], [], [], [], [3787], [], [3787], [3787], [], [], [2704], [], [2704], [2704], [2704], [], [], [], [], [], [], [2876], [], [2876], [2876], [2876], [2876], [2876], [2876], [], [2876], [2876], [2876], [2876], [2876], [2876], [], [2876], [2876], [2876], [2876], [2876], [2876], [], [2876], [2876], [2876], [2876], [2876], [2876], [], [2876], [2876], [2876], [2876], [2876], [2876], [], [2876], [2876], [2876], [2876], [2876], [2876], [], [], [], [3502], [], [3502], [], [], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [3502], [], [3502], [3502], [3502], [3502], [3502], [], [], [], []]