package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SeatMst implements Serializable {
    private Long seatId;

    private Long seatShpId;

    private String seatName;

    private Integer seatSort;

    private String seatDelFlg;

    private Date seatCdate;

    private Date seatCtime;

    private Date seatCtimestamp;

    private Date seatUdate;

    private Date seatUtime;

    private Date seatUtimestamp;

    private Long versionNo;

    private Long seatUpdateUser;

    private String seatUpdateSysName;

    private String seatUpdateClassName;

    private String seatUpdateMethodName;

    private String seatUpdateCrudKbn;

    private String seatSysRemarks;

    private static final long serialVersionUID = 1L;

    public enum Column {
        seatId("seat_id", "seatId", "BIGINT", false),
        seatShpId("seat_shp_id", "seatShpId", "BIGINT", false),
        seatName("seat_name", "seatName", "VARCHAR", false),
        seatSort("seat_sort", "seatSort", "INTEGER", false),
        seatDelFlg("seat_del_flg", "seatDelFlg", "CHAR", false),
        seatCdate("seat_cdate", "seatCdate", "DATE", false),
        seatCtime("seat_ctime", "seatCtime", "TIME", false),
        seatCtimestamp("seat_ctimestamp", "seatCtimestamp", "TIMESTAMP", false),
        seatUdate("seat_udate", "seatUdate", "DATE", false),
        seatUtime("seat_utime", "seatUtime", "TIME", false),
        seatUtimestamp("seat_utimestamp", "seatUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        seatUpdateUser("seat_update_user", "seatUpdateUser", "BIGINT", false),
        seatUpdateSysName("seat_update_sys_name", "seatUpdateSysName", "VARCHAR", false),
        seatUpdateClassName("seat_update_class_name", "seatUpdateClassName", "VARCHAR", false),
        seatUpdateMethodName("seat_update_method_name", "seatUpdateMethodName", "VARCHAR", false),
        seatUpdateCrudKbn("seat_update_crud_kbn", "seatUpdateCrudKbn", "CHAR", false),
        seatSysRemarks("seat_sys_remarks", "seatSysRemarks", "VARCHAR", false);

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