package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LayoutMst implements Serializable {
    private Long layId;

    private Long layShpId;

    private String layContent;

    private String layDelFlg;

    private Date layCdate;

    private Date layCtime;

    private Date layCtimestamp;

    private Date layUdate;

    private Date layUtime;

    private Date layUtimestamp;

    private Long versionNo;

    private Long layUpdateUser;

    private String layUpdateSysName;

    private String layUpdateClassName;

    private String layUpdateMethodName;

    private String layUpdateCrudKbn;

    private String laySysRemarks;

    private String laySvg;

    private static final long serialVersionUID = 1L;

    public enum Column {
        layId("lay_id", "layId", "BIGINT", false),
        layShpId("lay_shp_id", "layShpId", "BIGINT", false),
        layContent("lay_content", "layContent", "VARCHAR", false),
        layDelFlg("lay_del_flg", "layDelFlg", "CHAR", false),
        layCdate("lay_cdate", "layCdate", "DATE", false),
        layCtime("lay_ctime", "layCtime", "TIME", false),
        layCtimestamp("lay_ctimestamp", "layCtimestamp", "TIMESTAMP", false),
        layUdate("lay_udate", "layUdate", "DATE", false),
        layUtime("lay_utime", "layUtime", "TIME", false),
        layUtimestamp("lay_utimestamp", "layUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        layUpdateUser("lay_update_user", "layUpdateUser", "BIGINT", false),
        layUpdateSysName("lay_update_sys_name", "layUpdateSysName", "VARCHAR", false),
        layUpdateClassName("lay_update_class_name", "layUpdateClassName", "VARCHAR", false),
        layUpdateMethodName("lay_update_method_name", "layUpdateMethodName", "VARCHAR", false),
        layUpdateCrudKbn("lay_update_crud_kbn", "layUpdateCrudKbn", "CHAR", false),
        laySysRemarks("lay_sys_remarks", "laySysRemarks", "VARCHAR", false),
        laySvg("lay_svg", "laySvg", "VARCHAR", false);

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