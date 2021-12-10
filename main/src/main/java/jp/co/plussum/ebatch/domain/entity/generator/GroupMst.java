package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GroupMst implements Serializable {
    private Long grpId;

    private String grpCd;

    private String grpName;

    private String grpNameKn;

    private Long grpHdrComId;

    private String grpRemarks;

    private Date grpAvlDateFr;

    private Date grpAvlDateTo;

    private String grpDelFlg;

    private Date grpCdate;

    private Date grpCtime;

    private Date grpCtimestamp;

    private Date grpUdate;

    private Date grpUtime;

    private Date grpUtimestamp;

    private Long versionNo;

    private Long grpUpdateUser;

    private String grpUpdateSysName;

    private String grpUpdateClassName;

    private String grpUpdateMethodName;

    private String grpUpdateCrudKbn;

    private String grpSysRemarks;

    private Long grpUpdateAdmin;

    private static final long serialVersionUID = 1L;

    public enum Column {
        grpId("grp_id", "grpId", "BIGINT", false),
        grpCd("grp_cd", "grpCd", "VARCHAR", false),
        grpName("grp_name", "grpName", "VARCHAR", false),
        grpNameKn("grp_name_kn", "grpNameKn", "VARCHAR", false),
        grpHdrComId("grp_hdr_com_id", "grpHdrComId", "BIGINT", false),
        grpRemarks("grp_remarks", "grpRemarks", "VARCHAR", false),
        grpAvlDateFr("grp_avl_date_fr", "grpAvlDateFr", "DATE", false),
        grpAvlDateTo("grp_avl_date_to", "grpAvlDateTo", "DATE", false),
        grpDelFlg("grp_del_flg", "grpDelFlg", "CHAR", false),
        grpCdate("grp_cdate", "grpCdate", "DATE", false),
        grpCtime("grp_ctime", "grpCtime", "TIME", false),
        grpCtimestamp("grp_ctimestamp", "grpCtimestamp", "TIMESTAMP", false),
        grpUdate("grp_udate", "grpUdate", "DATE", false),
        grpUtime("grp_utime", "grpUtime", "TIME", false),
        grpUtimestamp("grp_utimestamp", "grpUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        grpUpdateUser("grp_update_user", "grpUpdateUser", "BIGINT", false),
        grpUpdateSysName("grp_update_sys_name", "grpUpdateSysName", "VARCHAR", false),
        grpUpdateClassName("grp_update_class_name", "grpUpdateClassName", "VARCHAR", false),
        grpUpdateMethodName("grp_update_method_name", "grpUpdateMethodName", "VARCHAR", false),
        grpUpdateCrudKbn("grp_update_crud_kbn", "grpUpdateCrudKbn", "CHAR", false),
        grpSysRemarks("grp_sys_remarks", "grpSysRemarks", "VARCHAR", false),
        grpUpdateAdmin("grp_update_admin", "grpUpdateAdmin", "BIGINT", false);

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