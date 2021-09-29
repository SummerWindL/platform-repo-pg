package com.platform.repo.pg.repo.user;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserAccountUpdateRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

	@Query(value= "select * from aix.f_mb_user_account_update(" +
		":in_userid, " + 
		":in_acc, " + 
		":in_pwd, " + 
		":in_salt, " + 
		":in_enableflag, " + 
		":in_hospcode, " + 
		":in_deptcode, " + 
		":in_doctorlevelcode, " + 
		":in_doctorlevelname, " + 
		":in_workdepartment, " + 
		":in_idcardno, " + 
		":in_phone, " + 
		":in_workno, " + 
		":in_signature, " + 
		":in_resume, " + 
		":in_doctorname, " + 
		":in_gendercode, " + 
		":in_gendername, " + 
		":in_birth, " + 
		":in_nickname, " + 
		":in_photo, " + 
		":in_certtype, " + 
		":in_certtypename, " + 
		":in_areacode, " + 
		":in_openflag, " + 
		":in_address, " + 
		":in_params" +
	")", nativeQuery = true)
	BasePlpgsqlModel fMbUserAccountUpdate(
            @Param("in_userid") String in_userid,
            @Param("in_acc") String in_acc,
            @Param("in_pwd") String in_pwd,
            @Param("in_salt") String in_salt,
            @Param("in_enableflag") Integer in_enableflag,
            @Param("in_hospcode") String in_hospcode,
            @Param("in_deptcode") String in_deptcode,
            @Param("in_doctorlevelcode") String in_doctorlevelcode,
            @Param("in_doctorlevelname") String in_doctorlevelname,
            @Param("in_workdepartment") String in_workdepartment,
            @Param("in_idcardno") String in_idcardno,
            @Param("in_phone") String in_phone,
            @Param("in_workno") String in_workno,
            @Param("in_signature") String in_signature,
            @Param("in_resume") String in_resume,
            @Param("in_doctorname") String in_doctorname,
            @Param("in_gendercode") String in_gendercode,
            @Param("in_gendername") String in_gendername,
            @Param("in_birth") String in_birth,
            @Param("in_nickname") String in_nickname,
            @Param("in_photo") String in_photo,
            @Param("in_certtype") String in_certtype,
            @Param("in_certtypename") String in_certtypename,
            @Param("in_areacode") String in_areacode,
            @Param("in_openflag") Integer in_openflag,
            @Param("in_address") String in_address,
            @Param("in_params") String in_params
    );

}