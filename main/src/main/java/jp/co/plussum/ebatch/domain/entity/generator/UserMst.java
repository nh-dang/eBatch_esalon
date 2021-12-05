package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserMst implements Serializable {
    private Long usrId;

    private String usrCd;

    private String usrPassword;

    private String usrFamName;

    private String usrFstName;

    private String usrFamNameKana;

    private String usrFstNameKana;

    private String usrTel01;

    private String usrTel02;

    private String usrTel03;

    private String usrFax01;

    private String usrFax02;

    private String usrFax03;

    private String usrPcMlAddr;

    private String usrMblMlAddr;

    private String usrRemarks;

    private Date usrAvlDateFr;

    private Date usrAvlDateTo;

    private String usrDelFlg;

    private Date usrCdate;

    private Date usrCtime;

    private Date usrCtimestamp;

    private Date usrUdate;

    private Date usrUtime;

    private Date usrUtimestamp;

    private Long versionNo;

    private Long usrUpdateUser;

    private String usrUpdateSysName;

    private String usrUpdateClassName;

    private String usrUpdateMethodName;

    private String usrUpdateCrudKbn;

    private String usrSysRemarks;

    private static final long serialVersionUID = 1L;

    public enum Column {
        usrId("usr_id", "usrId", "BIGINT", false),
        usrCd("usr_cd", "usrCd", "VARCHAR", false),
        usrPassword("usr_password", "usrPassword", "VARCHAR", false),
        usrFamName("usr_fam_name", "usrFamName", "VARCHAR", false),
        usrFstName("usr_fst_name", "usrFstName", "VARCHAR", false),
        usrFamNameKana("usr_fam_name_kana", "usrFamNameKana", "VARCHAR", false),
        usrFstNameKana("usr_fst_name_kana", "usrFstNameKana", "VARCHAR", false),
        usrTel01("usr_tel_01", "usrTel01", "VARCHAR", false),
        usrTel02("usr_tel_02", "usrTel02", "VARCHAR", false),
        usrTel03("usr_tel_03", "usrTel03", "VARCHAR", false),
        usrFax01("usr_fax_01", "usrFax01", "VARCHAR", false),
        usrFax02("usr_fax_02", "usrFax02", "VARCHAR", false),
        usrFax03("usr_fax_03", "usrFax03", "VARCHAR", false),
        usrPcMlAddr("usr_pc_ml_addr", "usrPcMlAddr", "VARCHAR", false),
        usrMblMlAddr("usr_mbl_ml_addr", "usrMblMlAddr", "VARCHAR", false),
        usrRemarks("usr_remarks", "usrRemarks", "VARCHAR", false),
        usrAvlDateFr("usr_avl_date_fr", "usrAvlDateFr", "DATE", false),
        usrAvlDateTo("usr_avl_date_to", "usrAvlDateTo", "DATE", false),
        usrDelFlg("usr_del_flg", "usrDelFlg", "CHAR", false),
        usrCdate("usr_cdate", "usrCdate", "DATE", false),
        usrCtime("usr_ctime", "usrCtime", "TIME", false),
        usrCtimestamp("usr_ctimestamp", "usrCtimestamp", "TIMESTAMP", false),
        usrUdate("usr_udate", "usrUdate", "DATE", false),
        usrUtime("usr_utime", "usrUtime", "TIME", false),
        usrUtimestamp("usr_utimestamp", "usrUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        usrUpdateUser("usr_update_user", "usrUpdateUser", "BIGINT", false),
        usrUpdateSysName("usr_update_sys_name", "usrUpdateSysName", "VARCHAR", false),
        usrUpdateClassName("usr_update_class_name", "usrUpdateClassName", "VARCHAR", false),
        usrUpdateMethodName("usr_update_method_name", "usrUpdateMethodName", "VARCHAR", false),
        usrUpdateCrudKbn("usr_update_crud_kbn", "usrUpdateCrudKbn", "CHAR", false),
        usrSysRemarks("usr_sys_remarks", "usrSysRemarks", "VARCHAR", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}