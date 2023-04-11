var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":500,"id":4102,"methods":[{"el":105,"sc":5,"sl":88},{"el":121,"sc":5,"sl":118},{"el":144,"sc":5,"sl":135},{"el":160,"sc":5,"sl":154},{"el":185,"sc":5,"sl":182},{"el":205,"sc":5,"sl":198},{"el":218,"sc":5,"sl":216},{"el":227,"sc":5,"sl":225},{"el":238,"sc":5,"sl":236},{"el":247,"sc":5,"sl":245},{"el":266,"sc":5,"sl":264},{"el":283,"sc":5,"sl":281},{"el":299,"sc":5,"sl":297},{"el":316,"sc":5,"sl":314},{"el":336,"sc":5,"sl":333},{"el":347,"sc":5,"sl":345},{"el":365,"sc":5,"sl":360},{"el":381,"sc":5,"sl":376},{"el":396,"sc":5,"sl":394},{"el":412,"sc":5,"sl":407},{"el":427,"sc":5,"sl":425},{"el":444,"sc":5,"sl":439},{"el":456,"sc":5,"sl":454},{"el":471,"sc":5,"sl":466},{"el":484,"sc":5,"sl":479},{"el":498,"sc":5,"sl":495}],"name":"Minutes","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1007":{"methods":[{"sl":88},{"sl":216},{"sl":333}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":334},{"sl":335}]},"test_1009":{"methods":[{"sl":88},{"sl":198},{"sl":216},{"sl":345}],"name":"testFactory_parseMinutes_String","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":102},{"sl":103},{"sl":200},{"sl":201},{"sl":203},{"sl":204},{"sl":217},{"sl":346}]},"test_1183":{"methods":[{"sl":88},{"sl":216},{"sl":245}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":246}]},"test_119":{"methods":[{"sl":88},{"sl":216},{"sl":245}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":246}]},"test_1196":{"methods":[{"sl":88},{"sl":182},{"sl":216},{"sl":345}],"name":"testFactory_standardMinutesIn_RPeriod","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":102},{"sl":103},{"sl":183},{"sl":184},{"sl":217},{"sl":346}]},"test_1340":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":360}],"name":"testPlus_int","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":361},{"sl":362},{"sl":364}]},"test_1542":{"methods":[{"sl":88},{"sl":216},{"sl":245}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":102},{"sl":103},{"sl":217},{"sl":246}]},"test_162":{"methods":[{"sl":88},{"sl":154},{"sl":216},{"sl":345}],"name":"testFactory_minutesIn_RInterval","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":96},{"sl":97},{"sl":102},{"sl":103},{"sl":155},{"sl":156},{"sl":158},{"sl":159},{"sl":217},{"sl":346}]},"test_1919":{"methods":[{"sl":88},{"sl":216},{"sl":297}],"name":"testToStandardHours","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":298}]},"test_1925":{"methods":[{"sl":88},{"sl":225}],"name":"testSerialization","pass":true,"statements":[{"sl":89},{"sl":96},{"sl":97},{"sl":226}]},"test_1929":{"methods":[{"sl":88},{"sl":216},{"sl":345}],"name":"testFactory_minutes_int","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":217},{"sl":346}]},"test_2093":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":454}],"name":"testNegated","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":455}]},"test_22":{"methods":[{"sl":88},{"sl":314}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":89},{"sl":96},{"sl":97},{"sl":315}]},"test_2390":{"methods":[{"sl":88},{"sl":216},{"sl":236}],"name":"testGetFieldType","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":237}]},"test_24":{"methods":[{"sl":88},{"sl":216},{"sl":495}],"name":"testToString","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":497}]},"test_249":{"methods":[{"sl":88},{"sl":345}],"name":"testToStandardMinutes_years","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":346}]},"test_2609":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":360},{"sl":376}],"name":"testPlus_Minutes","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":361},{"sl":362},{"sl":364},{"sl":377},{"sl":378},{"sl":380}]},"test_2744":{"methods":[{"sl":345}],"name":"testConstants","pass":true,"statements":[{"sl":346}]},"test_2799":{"methods":[{"sl":88},{"sl":216},{"sl":245}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":246}]},"test_2839":{"methods":[{"sl":88},{"sl":216},{"sl":281}],"name":"testToStandardDays","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":282}]},"test_3026":{"methods":[{"sl":88},{"sl":118},{"sl":216},{"sl":345}],"name":"testFactory_minutesBetween_RInstant","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":96},{"sl":97},{"sl":102},{"sl":103},{"sl":119},{"sl":120},{"sl":217},{"sl":346}]},"test_3177":{"methods":[{"sl":88},{"sl":135},{"sl":216},{"sl":236},{"sl":345}],"name":"testFactory_minutesBetween_RPartial","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":96},{"sl":97},{"sl":102},{"sl":103},{"sl":136},{"sl":137},{"sl":138},{"sl":140},{"sl":142},{"sl":143},{"sl":217},{"sl":237},{"sl":346}]},"test_3464":{"methods":[{"sl":88},{"sl":216},{"sl":345}],"name":"testGetMethods","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":346}]},"test_3491":{"methods":[{"sl":88}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95}]},"test_3497":{"methods":[{"sl":88},{"sl":216},{"sl":245}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":246}]},"test_3499":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":360},{"sl":394},{"sl":407}],"name":"testMinus_Minutes","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":361},{"sl":362},{"sl":364},{"sl":395},{"sl":408},{"sl":409},{"sl":411}]},"test_3775":{"methods":[{"sl":88},{"sl":216},{"sl":345}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":89},{"sl":92},{"sl":93},{"sl":98},{"sl":99},{"sl":102},{"sl":103},{"sl":217},{"sl":346}]},"test_3926":{"methods":[{"sl":88},{"sl":345}],"name":"testToStandardMinutes_months","pass":true,"statements":[{"sl":89},{"sl":90},{"sl":91},{"sl":346}]},"test_4054":{"methods":[{"sl":88},{"sl":216},{"sl":466}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":467},{"sl":468},{"sl":470}]},"test_476":{"methods":[{"sl":88},{"sl":198},{"sl":216},{"sl":245},{"sl":495}],"name":"testMinutes","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":200},{"sl":203},{"sl":204},{"sl":217},{"sl":246},{"sl":497}]},"test_563":{"methods":[{"sl":88},{"sl":216},{"sl":479}],"name":"testIsLessThan","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":480},{"sl":481},{"sl":483}]},"test_575":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":425}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":426}]},"test_650":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":439}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95},{"sl":96},{"sl":97},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":440},{"sl":441},{"sl":443}]},"test_752":{"methods":[{"sl":88},{"sl":216},{"sl":264}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":265}]},"test_851":{"methods":[{"sl":88},{"sl":216},{"sl":345},{"sl":360},{"sl":394}],"name":"testMinus_int","pass":true,"statements":[{"sl":89},{"sl":94},{"sl":95},{"sl":102},{"sl":103},{"sl":217},{"sl":346},{"sl":361},{"sl":362},{"sl":364},{"sl":395}]},"test_879":{"methods":[{"sl":88},{"sl":216},{"sl":236}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":89},{"sl":102},{"sl":103},{"sl":217},{"sl":237}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1340, 3497, 476, 575, 1929, 563, 851, 249, 3464, 2799, 650, 119, 3177, 1919, 2839, 1183, 1925, 1007, 3026, 22, 24, 4054, 2093, 3775, 752, 1542, 1009, 3499, 162, 879, 3491, 3926, 2609, 2390, 1196], [1340, 3497, 476, 575, 1929, 563, 851, 249, 3464, 2799, 650, 119, 3177, 1919, 2839, 1183, 1925, 1007, 3026, 22, 24, 4054, 2093, 3775, 752, 1542, 1009, 3499, 162, 879, 3491, 3926, 2609, 2390, 1196], [1929, 249, 3177, 3026, 1542, 1009, 162, 3926, 1196], [1929, 249, 3177, 3026, 1542, 1009, 162, 3926, 1196], [1929, 3775, 1542, 1009, 1196], [1929, 3775, 1542, 1009, 1196], [1340, 575, 1929, 851, 650, 1542, 1009, 3499, 3491, 2609, 1196], [1340, 575, 1929, 851, 650, 1542, 1009, 3499, 3491, 2609, 1196], [1929, 650, 3177, 1925, 3026, 22, 3499, 162, 2609], [1929, 650, 3177, 1925, 3026, 22, 3499, 162, 2609], [1929, 3775], [1929, 3775], [1929], [1929], [1340, 3497, 476, 575, 1929, 563, 851, 3464, 2799, 650, 119, 3177, 1919, 2839, 1183, 1007, 3026, 24, 4054, 2093, 3775, 752, 1542, 1009, 3499, 162, 879, 2609, 2390, 1196], [1340, 3497, 476, 575, 1929, 563, 851, 3464, 2799, 650, 119, 3177, 1919, 2839, 1183, 1007, 3026, 24, 4054, 2093, 3775, 752, 1542, 1009, 3499, 162, 879, 2609, 2390, 1196], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3026], [3026], [3026], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3177], [3177], [3177], [3177], [], [3177], [], [3177], [3177], [], [], [], [], [], [], [], [], [], [], [162], [162], [162], [], [162], [162], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1196], [1196], [1196], [], [], [], [], [], [], [], [], [], [], [], [], [], [476, 1009], [], [476, 1009], [1009], [], [476, 1009], [476, 1009], [], [], [], [], [], [], [], [], [], [], [], [1340, 3497, 476, 575, 1929, 563, 851, 3464, 2799, 650, 119, 3177, 1919, 2839, 1183, 1007, 3026, 24, 4054, 2093, 3775, 752, 1542, 1009, 3499, 162, 879, 2609, 2390, 1196], [1340, 3497, 476, 575, 1929, 563, 851, 3464, 2799, 650, 119, 3177, 1919, 2839, 1183, 1007, 3026, 24, 4054, 2093, 3775, 752, 1542, 1009, 3499, 162, 879, 2609, 2390, 1196], [], [], [], [], [], [], [], [1925], [1925], [], [], [], [], [], [], [], [], [], [3177, 879, 2390], [3177, 879, 2390], [], [], [], [], [], [], [], [3497, 476, 2799, 119, 1183, 1542], [3497, 476, 2799, 119, 1183, 1542], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [752], [752], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2839], [2839], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1919], [1919], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [22], [22], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1007], [1007], [1007], [], [], [], [], [], [], [], [], [], [1340, 575, 1929, 2744, 851, 249, 3464, 650, 3177, 3026, 2093, 3775, 1009, 3499, 162, 3926, 2609, 1196], [1340, 575, 1929, 2744, 851, 249, 3464, 650, 3177, 3026, 2093, 3775, 1009, 3499, 162, 3926, 2609, 1196], [], [], [], [], [], [], [], [], [], [], [], [], [], [1340, 851, 3499, 2609], [1340, 851, 3499, 2609], [1340, 851, 3499, 2609], [], [1340, 851, 3499, 2609], [], [], [], [], [], [], [], [], [], [], [], [2609], [2609], [2609], [], [2609], [], [], [], [], [], [], [], [], [], [], [], [], [], [851, 3499], [851, 3499], [], [], [], [], [], [], [], [], [], [], [], [3499], [3499], [3499], [], [3499], [], [], [], [], [], [], [], [], [], [], [], [], [], [575], [575], [], [], [], [], [], [], [], [], [], [], [], [], [650], [650], [650], [], [650], [], [], [], [], [], [], [], [], [], [], [2093], [2093], [], [], [], [], [], [], [], [], [], [], [4054], [4054], [4054], [], [4054], [], [], [], [], [], [], [], [], [563], [563], [563], [], [563], [], [], [], [], [], [], [], [], [], [], [], [476, 24], [], [476, 24], [], [], []]