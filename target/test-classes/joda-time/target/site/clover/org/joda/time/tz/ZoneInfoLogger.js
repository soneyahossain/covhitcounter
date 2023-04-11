var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":22284,"methods":[{"el":26,"sc":9,"sl":24},{"el":36,"sc":5,"sl":34},{"el":40,"sc":5,"sl":38}],"name":"ZoneInfoLogger","sl":21}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2779":{"methods":[{"sl":38}],"name":"testCompileOnBrokenTimeZoneFile","pass":true,"statements":[{"sl":39}]},"test_3133":{"methods":[{"sl":38}],"name":"testCompileOnBrokenTimeZoneFile_2","pass":true,"statements":[{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2779, 3133], [2779, 3133], [], [], []]
