var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":362,"id":32737,"methods":[{"el":48,"sc":5,"sl":36},{"el":104,"sc":5,"sl":61},{"el":123,"sc":5,"sl":106},{"el":210,"sc":5,"sl":125},{"el":229,"sc":5,"sl":212},{"el":247,"sc":5,"sl":231},{"el":280,"sc":5,"sl":249},{"el":326,"sc":5,"sl":282},{"el":361,"sc":5,"sl":329}],"name":"TestIllegalFieldValueException","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1116":{"methods":[{"sl":249}],"name":"testGJCutover","pass":true,"statements":[{"sl":251},{"sl":252},{"sl":253},{"sl":256},{"sl":257},{"sl":258},{"sl":259},{"sl":260},{"sl":261},{"sl":262},{"sl":263},{"sl":266},{"sl":267},{"sl":268},{"sl":271},{"sl":272},{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":278}]},"test_1364":{"methods":[{"sl":61}],"name":"testVerifyValueBounds","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":77},{"sl":78},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":91},{"sl":92},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102}]},"test_1738":{"methods":[{"sl":106}],"name":"testSkipDateTimeField","pass":true,"statements":[{"sl":108},{"sl":110},{"sl":111},{"sl":114},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121}]},"test_1795":{"methods":[{"sl":125}],"name":"testSetText","pass":true,"statements":[{"sl":127},{"sl":128},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":141},{"sl":142},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":155},{"sl":156},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":169},{"sl":170},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":183},{"sl":184},{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":197},{"sl":198},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208}]},"test_1836":{"methods":[{"sl":231}],"name":"testJulianYearZero","pass":true,"statements":[{"sl":233},{"sl":234},{"sl":235},{"sl":238},{"sl":239},{"sl":240},{"sl":241},{"sl":242},{"sl":243},{"sl":244},{"sl":245}]},"test_2337":{"methods":[{"sl":329}],"name":"testOtherConstructors","pass":true,"statements":[{"sl":331},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":338},{"sl":339},{"sl":340},{"sl":342},{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":348},{"sl":349},{"sl":350},{"sl":352},{"sl":353},{"sl":354},{"sl":355},{"sl":356},{"sl":357},{"sl":358},{"sl":359},{"sl":360}]},"test_332":{"methods":[{"sl":212}],"name":"testZoneTransition","pass":true,"statements":[{"sl":214},{"sl":216},{"sl":217},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227}]},"test_991":{"methods":[{"sl":282}],"name":"testReadablePartialValidate","pass":true,"statements":[{"sl":285},{"sl":286},{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":296},{"sl":299},{"sl":300},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":307},{"sl":308},{"sl":309},{"sl":310},{"sl":313},{"sl":314},{"sl":317},{"sl":318},{"sl":319},{"sl":320},{"sl":321},{"sl":322},{"sl":323},{"sl":324}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1364], [], [1364], [1364], [], [], [1364], [1364], [1364], [1364], [1364], [1364], [1364], [1364], [], [], [1364], [1364], [], [], [1364], [1364], [1364], [1364], [1364], [1364], [1364], [1364], [], [], [1364], [1364], [], [], [1364], [1364], [1364], [1364], [1364], [1364], [1364], [1364], [], [], [], [1738], [], [1738], [], [1738], [1738], [], [], [1738], [1738], [1738], [1738], [1738], [1738], [1738], [1738], [], [], [], [1795], [], [1795], [1795], [], [], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [], [], [1795], [1795], [], [], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [], [], [1795], [1795], [], [], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [], [], [1795], [1795], [], [], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [], [], [1795], [1795], [], [], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [], [], [1795], [1795], [], [], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [1795], [], [], [], [332], [], [332], [], [332], [332], [], [], [332], [332], [332], [332], [332], [332], [332], [332], [], [], [], [1836], [], [1836], [1836], [1836], [], [], [1836], [1836], [1836], [1836], [1836], [1836], [1836], [1836], [], [], [], [1116], [], [1116], [1116], [1116], [], [], [1116], [1116], [1116], [1116], [1116], [1116], [1116], [1116], [], [], [1116], [1116], [1116], [], [], [1116], [1116], [1116], [1116], [1116], [1116], [1116], [1116], [], [], [], [991], [], [], [991], [991], [], [], [991], [991], [991], [991], [991], [991], [991], [991], [], [], [991], [991], [], [], [991], [991], [991], [991], [991], [991], [991], [991], [], [], [991], [991], [], [], [991], [991], [991], [991], [991], [991], [991], [991], [], [], [], [], [2337], [], [2337], [], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [2337], [], []]
