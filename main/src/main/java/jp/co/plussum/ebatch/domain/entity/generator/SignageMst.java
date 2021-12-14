package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SignageMst implements Serializable {
    private Long sigId;

    private String sigImagePath;

    private String sigDelFlg;

    private Date sigCdate;

    private Date sigCtime;

    private Date sigCtimestamp;

    private Date sigUdate;

    private Date sigUtime;

    private Date sigUtimestamp;

    private Long versionNo;

    private Long sigUpdateUser;

    private String sigUpdateSysName;

    private String sigUpdateClassName;

    private String sigUpdateMethodName;

    private String sigUpdateCrudKbn;

    private String sigSysRemarks;

    private static final long serialVersionUID = 1L;

    public enum Column {
        sigId("sig_id", "sigId", "BIGINT", false),
        sigImagePath("sig_image_path", "sigImagePath", "VARCHAR", false),
        sigDelFlg("sig_del_flg", "sigDelFlg", "CHAR", false),
        sigCdate("sig_cdate", "sigCdate", "DATE", false),
        sigCtime("sig_ctime", "sigCtime", "TIME", false),
        sigCtimestamp("sig_ctimestamp", "sigCtimestamp", "TIMESTAMP", false),
        sigUdate("sig_udate", "sigUdate", "DATE", false),
        sigUtime("sig_utime", "sigUtime", "TIME", false),
        sigUtimestamp("sig_utimestamp", "sigUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        sigUpdateUser("sig_update_user", "sigUpdateUser", "BIGINT", false),
        sigUpdateSysName("sig_update_sys_name", "sigUpdateSysName", "VARCHAR", false),
        sigUpdateClassName("sig_update_class_name", "sigUpdateClassName", "VARCHAR", false),
        sigUpdateMethodName("sig_update_method_name", "sigUpdateMethodName", "VARCHAR", false),
        sigUpdateCrudKbn("sig_update_crud_kbn", "sigUpdateCrudKbn", "CHAR", false),
        sigSysRemarks("sig_sys_remarks", "sigSysRemarks", "VARCHAR", false);

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