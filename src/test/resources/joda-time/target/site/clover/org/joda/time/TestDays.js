var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":560,"id":31054,"methods":[{"el":129,"sc":5,"sl":39},{"el":144,"sc":5,"sl":142},{"el":148,"sc":5,"sl":146},{"el":163,"sc":5,"sl":151},{"el":180,"sc":5,"sl":166},{"el":194,"sc":5,"sl":183},{"el":209,"sc":5,"sl":197},{"el":223,"sc":5,"sl":211},{"el":241,"sc":5,"sl":225},{"el":255,"sc":5,"sl":244},{"el":275,"sc":5,"sl":258},{"el":297,"sc":5,"sl":277},{"el":304,"sc":5,"sl":300},{"el":310,"sc":5,"sl":306},{"el":316,"sc":5,"sl":312},{"el":326,"sc":5,"sl":319},{"el":335,"sc":5,"sl":328},{"el":345,"sc":5,"sl":338},{"el":364,"sc":5,"sl":348},{"el":372,"sc":5,"sl":367},{"el":386,"sc":5,"sl":374},{"el":400,"sc":5,"sl":388},{"el":414,"sc":5,"sl":402},{"el":424,"sc":5,"sl":416},{"el":442,"sc":5,"sl":427},{"el":462,"sc":5,"sl":444},{"el":479,"sc":5,"sl":464},{"el":499,"sc":5,"sl":481},{"el":516,"sc":5,"sl":501},{"el":535,"sc":5,"sl":518},{"el":549,"sc":5,"sl":537},{"el":558,"sc":5,"sl":552}],"name":"TestDays","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1183":{"methods":[{"sl":388}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":390},{"sl":391},{"sl":392},{"sl":394},{"sl":395}]},"test_1213":{"methods":[{"sl":166}],"name":"testFactory_days_int","pass":true,"statements":[{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179}]},"test_1234":{"methods":[{"sl":518}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":520},{"sl":521},{"sl":522},{"sl":523},{"sl":524},{"sl":525},{"sl":526},{"sl":527},{"sl":529},{"sl":530}]},"test_1445":{"methods":[{"sl":427}],"name":"testPlus_int","pass":true,"statements":[{"sl":429},{"sl":430},{"sl":431},{"sl":432},{"sl":434},{"sl":436},{"sl":437}]},"test_1899":{"methods":[{"sl":501}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":503},{"sl":504},{"sl":505},{"sl":506},{"sl":507},{"sl":509},{"sl":510},{"sl":511}]},"test_1908":{"methods":[{"sl":244}],"name":"testFactory_daysIn_RInterval","pass":true,"statements":[{"sl":246},{"sl":247},{"sl":248},{"sl":250},{"sl":251},{"sl":252},{"sl":253},{"sl":254}]},"test_219":{"methods":[{"sl":328}],"name":"testIsLessThan","pass":true,"statements":[{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334}]},"test_229":{"methods":[{"sl":416}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":418},{"sl":419},{"sl":420},{"sl":422},{"sl":423}]},"test_2532":{"methods":[{"sl":319}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":321},{"sl":322},{"sl":323},{"sl":324},{"sl":325}]},"test_2760":{"methods":[{"sl":258}],"name":"testFactory_standardDaysIn_RPeriod","pass":true,"statements":[{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269},{"sl":270}]},"test_2969":{"methods":[{"sl":300}],"name":"testGetMethods","pass":true,"statements":[{"sl":302},{"sl":303}]},"test_3037":{"methods":[{"sl":151}],"name":"testConstants","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162}]},"test_3178":{"methods":[{"sl":552}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":554},{"sl":555},{"sl":556},{"sl":557}]},"test_3202":{"methods":[{"sl":481}],"name":"testMinus_Days","pass":true,"statements":[{"sl":483},{"sl":484},{"sl":485},{"sl":486},{"sl":487},{"sl":488},{"sl":490},{"sl":491},{"sl":493},{"sl":494}]},"test_3230":{"methods":[{"sl":183}],"name":"testFactory_daysBetween_RInstant","pass":true,"statements":[{"sl":185},{"sl":186},{"sl":187},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193}]},"test_3245":{"methods":[{"sl":367}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":369},{"sl":370},{"sl":371}]},"test_339":{"methods":[{"sl":338}],"name":"testToString","pass":true,"statements":[{"sl":340},{"sl":341},{"sl":343},{"sl":344}]},"test_3392":{"methods":[{"sl":312}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":314},{"sl":315}]},"test_3541":{"methods":[{"sl":277}],"name":"testFactory_parseDays_String","pass":true,"statements":[{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":291},{"sl":292}]},"test_355":{"methods":[{"sl":374}],"name":"testToStandardHours","pass":true,"statements":[{"sl":376},{"sl":377},{"sl":378},{"sl":380},{"sl":381}]},"test_362":{"methods":[{"sl":211}],"name":"testFactory_daysBetween_RPartial_YearMonth","pass":true,"statements":[{"sl":213},{"sl":214},{"sl":215},{"sl":216},{"sl":218},{"sl":219},{"sl":221},{"sl":222}]},"test_3680":{"methods":[{"sl":537}],"name":"testNegated","pass":true,"statements":[{"sl":539},{"sl":540},{"sl":541},{"sl":543},{"sl":544}]},"test_3977":{"methods":[{"sl":464}],"name":"testMinus_int","pass":true,"statements":[{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":471},{"sl":473},{"sl":474}]},"test_4034":{"methods":[{"sl":225}],"name":"testFactory_daysBetween_RPartial_MonthDay","pass":true,"statements":[{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":237},{"sl":238},{"sl":239},{"sl":240}]},"test_4134":{"methods":[{"sl":444}],"name":"testPlus_Days","pass":true,"statements":[{"sl":446},{"sl":447},{"sl":448},{"sl":449},{"sl":450},{"sl":451},{"sl":453},{"sl":454},{"sl":456},{"sl":457}]},"test_444":{"methods":[{"sl":402}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":404},{"sl":405},{"sl":406},{"sl":408},{"sl":409}]},"test_785":{"methods":[{"sl":306}],"name":"testGetFieldType","pass":true,"statements":[{"sl":308},{"sl":309}]},"test_825":{"methods":[{"sl":197}],"name":"testFactory_daysBetween_RPartial_LocalDate","pass":true,"statements":[{"sl":200},{"sl":201},{"sl":202},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208}]},"test_881":{"methods":[{"sl":348}],"name":"testSerialization","pass":true,"statements":[{"sl":350},{"sl":352},{"sl":353},{"sl":354},{"sl":355},{"sl":356},{"sl":358},{"sl":359},{"sl":360},{"sl":361},{"sl":363}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3037], [], [3037], [3037], [3037], [3037], [3037], [3037], [3037], [3037], [3037], [3037], [], [], [], [1213], [], [1213], [1213], [1213], [1213], [1213], [1213], [1213], [1213], [1213], [1213], [1213], [1213], [], [], [], [3230], [], [3230], [3230], [3230], [], [3230], [3230], [3230], [3230], [3230], [], [], [], [825], [], [], [825], [825], [825], [], [825], [825], [825], [825], [825], [], [], [362], [], [362], [362], [362], [362], [], [362], [362], [], [362], [362], [], [], [4034], [], [4034], [4034], [4034], [4034], [], [4034], [4034], [4034], [4034], [], [4034], [4034], [4034], [4034], [], [], [], [1908], [], [1908], [1908], [1908], [], [1908], [1908], [1908], [1908], [1908], [], [], [], [2760], [], [2760], [2760], [2760], [2760], [2760], [2760], [2760], [2760], [2760], [2760], [2760], [], [], [], [], [], [], [3541], [], [3541], [3541], [3541], [3541], [3541], [3541], [3541], [3541], [], [], [], [], [3541], [3541], [], [], [], [], [], [], [], [2969], [], [2969], [2969], [], [], [785], [], [785], [785], [], [], [3392], [], [3392], [3392], [], [], [], [2532], [], [2532], [2532], [2532], [2532], [2532], [], [], [219], [], [219], [219], [219], [219], [219], [], [], [], [339], [], [339], [339], [], [339], [339], [], [], [], [881], [], [881], [], [881], [881], [881], [881], [881], [], [881], [881], [881], [881], [], [881], [], [], [], [3245], [], [3245], [3245], [3245], [], [], [355], [], [355], [355], [355], [], [355], [355], [], [], [], [], [], [], [1183], [], [1183], [1183], [1183], [], [1183], [1183], [], [], [], [], [], [], [444], [], [444], [444], [444], [], [444], [444], [], [], [], [], [], [], [229], [], [229], [229], [229], [], [229], [229], [], [], [], [1445], [], [1445], [1445], [1445], [1445], [], [1445], [], [1445], [1445], [], [], [], [], [], [], [4134], [], [4134], [4134], [4134], [4134], [4134], [4134], [], [4134], [4134], [], [4134], [4134], [], [], [], [], [], [], [3977], [], [3977], [3977], [3977], [3977], [], [3977], [], [3977], [3977], [], [], [], [], [], [], [3202], [], [3202], [3202], [3202], [3202], [3202], [3202], [], [3202], [3202], [], [3202], [3202], [], [], [], [], [], [], [1899], [], [1899], [1899], [1899], [1899], [1899], [], [1899], [1899], [1899], [], [], [], [], [], [], [1234], [], [1234], [1234], [1234], [1234], [1234], [1234], [1234], [1234], [], [1234], [1234], [], [], [], [], [], [], [3680], [], [3680], [3680], [3680], [], [3680], [3680], [], [], [], [], [], [], [], [3178], [], [3178], [3178], [3178], [3178], [], [], []]
