package com.platform.repo.pg.repo.user.account;

import com.platform.repo.pg.model.base.BasePlpgsqlModel;
import com.platform.repo.pg.repo.base.CommonCustomRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;


/**
 * @date 2018/04/23
 */
public interface UserAccountRepository extends CommonCustomRepository<BasePlpgsqlModel, Integer> {

    /**
     * 检验用户密码是否合法
     * @param in_acc
     * @param in_pwd
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_check(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel check(String in_acc, String in_pwd);

    /**
     * 查询用户信息
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_query(?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    BasePlpgsqlModel query(String in_acc, String in_userid, Integer in_countflag, Integer in_offset, Integer in_pagesize);

    /**
     * 删除用户信息
     * @param in_acc
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_delete(?1, ?2)", nativeQuery = true)
    BasePlpgsqlModel deleteUserAccount(String in_acc, String in_userid);

    /**
     * 新增用户信息
     * @param in_userid
     * @param in_acc
     * @param in_pwd
     * @param in_salt
     * @param in_enableflag
     * @param in_hospcode
     * @param in_deptcode
     * @param in_doctorlevelcode
     * @param in_doctorlevelname
     * @param in_workdepartment
     * @param in_idcardno
     * @param in_phone
     * @param in_workno
     * @param in_signature
     * @param in_resume
     * @param in_doctorname
     * @param in_gendercode
     * @param in_gendername
     * @param in_birth
     * @param in_nickname
     * @param in_photo
     * @param in_certtype
     * @param in_certtypename
     * @param in_areacode
     * @param in_openflag
     * @param in_address
     * @param in_params
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_insert(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27)", nativeQuery = true)
    BasePlpgsqlModel insertUserAccount(String in_userid,
                                       String in_acc,
                                       String in_pwd,
                                       String in_salt,
                                       Integer in_enableflag,
                                       String in_hospcode,
                                       String in_deptcode,
                                       String in_doctorlevelcode,
                                       String in_doctorlevelname,
                                       String in_workdepartment,
                                       String in_idcardno,
                                       String in_phone,
                                       String in_workno,
                                       String in_signature,
                                       String in_resume,
                                       String in_doctorname,
                                       String in_gendercode,
                                       String in_gendername,
                                       Date in_birth,
                                       String in_nickname,
                                       String in_photo,
                                       String in_certtype,
                                       String in_certtypename,
                                       String in_areacode,
                                       Integer in_openflag,
                                       String in_address,
                                       String in_params);

    /**
     * 修改用户信息
     * @param in_userid
     * @param in_acc
     * @param in_pwd
     * @param in_salt
     * @param in_enableflag
     * @param in_hospcode
     * @param in_deptcode
     * @param in_doctorlevelcode
     * @param in_doctorlevelname
     * @param in_workdepartment
     * @param in_idcardno
     * @param in_phone
     * @param in_workno
     * @param in_signature
     * @param in_resume
     * @param in_doctorname
     * @param in_gendercode
     * @param in_gendername
     * @param in_birth
     * @param in_nickname
     * @param in_photo
     * @param in_certtype
     * @param in_certtypename
     * @param in_areacode
     * @param in_openflag
     * @param in_address
     * @param in_params
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_update(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15, ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27)", nativeQuery = true)
    BasePlpgsqlModel updateUserAccount(String in_userid,
                                       String in_acc,
                                       String in_pwd,
                                       String in_salt,
                                       Integer in_enableflag,
                                       String in_hospcode,
                                       String in_deptcode,
                                       String in_doctorlevelcode,
                                       String in_doctorlevelname,
                                       String in_workdepartment,
                                       String in_idcardno,
                                       String in_phone,
                                       String in_workno,
                                       String in_signature,
                                       String in_resume,
                                       String in_doctorname,
                                       String in_gendercode,
                                       String in_gendername,
                                       Date in_birth,
                                       String in_nickname,
                                       String in_photo,
                                       String in_certtype,
                                       String in_certtypename,
                                       String in_areacode,
                                       Integer in_openflag,
                                       String in_address,
                                       String in_params);

    /**
     * 重置密码
     * @param in_acc
     * @return
     */
    @Query(value= "select * from aix.f_mb_user_account_reset_pwd(:in_userid, :in_acc, :in_pwd, :in_salt)", nativeQuery = true)
    BasePlpgsqlModel resetUserAccountPwd(
            @Param("in_userid") String in_userid,
            @Param("in_acc") String in_acc,
            @Param("in_pwd") String in_pwd,
            @Param("in_salt") String in_salt
    );
    
}
