var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":64700,"methods":[{"el":33,"sc":5,"sl":31},{"el":37,"sc":5,"sl":35},{"el":41,"sc":5,"sl":39},{"el":45,"sc":5,"sl":43},{"el":48,"sc":5,"sl":47},{"el":51,"sc":5,"sl":50},{"el":54,"sc":5,"sl":53},{"el":57,"sc":5,"sl":56},{"el":61,"sc":5,"sl":59},{"el":65,"sc":5,"sl":63},{"el":69,"sc":5,"sl":67},{"el":73,"sc":5,"sl":71}],"name":"MockUnknownCalendar","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_15":{"methods":[{"sl":35}],"name":"testGetChronology_Object_Zone","pass":true,"statements":[{"sl":36}]},"test_81":{"methods":[{"sl":35},{"sl":43}],"name":"testGetChronology_Object_nullChronology","pass":true,"statements":[{"sl":36},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [81, 15], [81, 15], [], [], [], [], [], [], [81], [81], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
