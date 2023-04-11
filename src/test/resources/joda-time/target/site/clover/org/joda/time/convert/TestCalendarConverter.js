var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":237,"id":64753,"methods":[{"el":88,"sc":5,"sl":56},{"el":105,"sc":5,"sl":101},{"el":110,"sc":5,"sl":107},{"el":128,"sc":5,"sl":113},{"el":134,"sc":5,"sl":131},{"el":143,"sc":5,"sl":137},{"el":178,"sc":5,"sl":146},{"el":212,"sc":5,"sl":180},{"el":218,"sc":5,"sl":214},{"el":229,"sc":5,"sl":221},{"el":235,"sc":5,"sl":232}],"name":"TestCalendarConverter","sl":49}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1100":{"methods":[{"sl":232}],"name":"testToString","pass":true,"statements":[{"sl":234}]},"test_1335":{"methods":[{"sl":137}],"name":"testGetInstantMillis_Object_Chronology","pass":true,"statements":[{"sl":139},{"sl":140},{"sl":141},{"sl":142}]},"test_15":{"methods":[{"sl":146}],"name":"testGetChronology_Object_Zone","pass":true,"statements":[{"sl":148},{"sl":149},{"sl":151},{"sl":152},{"sl":154},{"sl":155},{"sl":156},{"sl":158},{"sl":159},{"sl":160},{"sl":162},{"sl":163},{"sl":164},{"sl":166},{"sl":167},{"sl":169},{"sl":170},{"sl":171},{"sl":172}]},"test_2917":{"methods":[{"sl":131}],"name":"testSupportedType","pass":true,"statements":[{"sl":133}]},"test_3395":{"methods":[{"sl":214}],"name":"testGetChronology_Object_Chronology","pass":true,"statements":[{"sl":216},{"sl":217}]},"test_3628":{"methods":[{"sl":221}],"name":"testGetPartialValues","pass":true,"statements":[{"sl":223},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":228}]},"test_4192":{"methods":[{"sl":113}],"name":"testSingleton","pass":true,"statements":[{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":120},{"sl":121},{"sl":122},{"sl":124},{"sl":125},{"sl":126},{"sl":127}]},"test_81":{"methods":[{"sl":180}],"name":"testGetChronology_Object_nullChronology","pass":true,"statements":[{"sl":182},{"sl":183},{"sl":185},{"sl":186},{"sl":187},{"sl":189},{"sl":190},{"sl":191},{"sl":193},{"sl":194},{"sl":195},{"sl":197},{"sl":198},{"sl":200},{"sl":201},{"sl":203},{"sl":204},{"sl":205},{"sl":206}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4192], [], [4192], [4192], [4192], [4192], [], [4192], [4192], [4192], [], [4192], [4192], [4192], [4192], [], [], [], [2917], [], [2917], [], [], [], [1335], [], [1335], [1335], [1335], [1335], [], [], [], [15], [], [15], [15], [], [15], [15], [], [15], [15], [15], [], [15], [15], [15], [], [15], [15], [15], [], [15], [15], [], [15], [15], [15], [15], [], [], [], [], [], [], [], [81], [], [81], [81], [], [81], [81], [81], [], [81], [81], [81], [], [81], [81], [81], [], [81], [81], [], [81], [81], [], [81], [81], [81], [81], [], [], [], [], [], [], [], [3395], [], [3395], [3395], [], [], [], [3628], [], [3628], [3628], [3628], [3628], [3628], [3628], [], [], [], [1100], [], [1100], [], [], []]