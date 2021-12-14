package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SignageShpFil implements Serializable {
    private Long ssfId;

    private Long ssfSigId;

    private Long ssfShpId;

    private String ssfDelFlg;

    private Date ssfCdate;

    private Date ssfCtime;

    private Date ssfCtimestamp;

    private Date ssfUdate;

    private Date ssfUtime;

    private Date ssfUtimestamp;

    private Long versionNo;

    private Long ssfUpdateUser;

    private String ssfUpdateSysName;

    private String ssfUpdateClassName;

    private String ssfUpdateMethodName;

    private String ssfUpdateCrudKbn;

    private String ssfSysRemarks;

    private String ssfFileId;

    private static final long serialVersionUID = 1L;

    public enum Column {
        ssfId("ssf_id", "ssfId", "BIGINT", false),
        ssfSigId("ssf_sig_id", "ssfSigId", "BIGINT", false),
        ssfShpId("ssf_shp_id", "ssfShpId", "BIGINT", false),
        ssfDelFlg("ssf_del_flg", "ssfDelFlg", "CHAR", false),
        ssfCdate("ssf_cdate", "ssfCdate", "DATE", false),
        ssfCtime("ssf_ctime", "ssfCtime", "TIME", false),
        ssfCtimestamp("ssf_ctimestamp", "ssfCtimestamp", "TIMESTAMP", false),
        ssfUdate("ssf_udate", "ssfUdate", "DATE", false),
        ssfUtime("ssf_utime", "ssfUtime", "TIME", false),
        ssfUtimestamp("ssf_utimestamp", "ssfUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        ssfUpdateUser("ssf_update_user", "ssfUpdateUser", "BIGINT", false),
        ssfUpdateSysName("ssf_update_sys_name", "ssfUpdateSysName", "VARCHAR", false),
        ssfUpdateClassName("ssf_update_class_name", "ssfUpdateClassName", "VARCHAR", false),
        ssfUpdateMethodName("ssf_update_method_name", "ssfUpdateMethodName", "VARCHAR", false),
        ssfUpdateCrudKbn("ssf_update_crud_kbn", "ssfUpdateCrudKbn", "CHAR", false),
        ssfSysRemarks("ssf_sys_remarks", "ssfSysRemarks", "VARCHAR", false),
        ssfFileId("ssf_file_id", "ssfFileId", "VARCHAR", false);

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