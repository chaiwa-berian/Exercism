selected-at(sort(join(' ', instance('casedb')/casedb/case[@case_type='nutrition_volunteer'][@status = 'open'][index/parent = current()/@case_id]/date_next_supervision)), if(count(instance('casedb')/casedb/case[@case_type='nutrition_volunteer'][@status = 'open'][index/parent = current()/@case_id]) = 0,0,count(instance('casedb')/casedb/case[@case_type='nutrition_volunteer'][@status = 'open'][index/parent = current()/@case_id])-1))

if(count(instance('casedb')/casedb/case[@case_type='caregroup_training_attendance'][@status = 'open'][present = 'yes'][parent_id = current()/@case_id]) = 0, '', selected-at(sort(join(' ', instance('casedb')/casedb/case[@case_type='caregroup_training_attendance'][@status = 'open'][present = 'yes'][parent_id = current()/@case_id]/training_date)), count(instance('casedb')/casedb/case[@case_type='caregroup_training_attendance'][@status = 'open'][present = 'yes'][parent_id = current()/@case_id])-1))



selected-at(sort(join(' ', instance('casedb')/casedb/case[@case_type='nutrition_volunteer'][@status = 'open'][index/parent = current()/@case_id]/date_next_supervision), false()), if(count(instance('casedb')/casedb/case[@case_type='nutrition_volunteer'][@status = 'open'][index/parent = current()/@case_id]) = 0,0,count(instance('casedb')/casedb/case[@case_type='nutrition_volunteer'][@status = 'open'][index/parent = current()/@case_id])-1))