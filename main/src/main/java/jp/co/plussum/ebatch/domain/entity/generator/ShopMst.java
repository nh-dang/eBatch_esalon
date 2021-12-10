package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShopMst implements Serializable {
    private Long shpId;

    private String shpCd;

    private String shpPass;

    private Long shpHdrComId;

    private Long shpOpeComId;

    private Long shpGrpId;

    private String shpName;

    private String shpNameKn;

    private String shpZipCd;

    private String shpAddr01;

    private String shpAddr02;

    private String shpAddr03;

    private String shpAddr04;

    private String shpTel01;

    private String shpTel02;

    private String shpTel03;

    private String shpFax01;

    private String shpFax02;

    private String shpFax03;

    private String shpRemarks;

    private Date shpAvlDateFr;

    private Date shpAvlDateTo;

    private String shpDelFlg;

    private Date shpCdate;

    private Date shpCtime;

    private Date shpCtimestamp;

    private Date shpUdate;

    private Date shpUtime;

    private Date shpUtimestamp;

    private Long versionNo;

    private Long shpUpdateUser;

    private String shpUpdateSysName;

    private String shpUpdateClassName;

    private String shpUpdateMethodName;

    private String shpUpdateCrudKbn;

    private String shpSysRemarks;

    private String shpPrfCd;

    private String shpPcMlAddr;

    private String shpMblMlAddr;

    private Long shpUpdateAdmin;

    private String shpRptMlAddr;

    private Date shpInstallDate;

    private String shpComNo;

    private String shpComName;

    private static final long serialVersionUID = 1L;

    public enum Column {
        shpId("shp_id", "shpId", "BIGINT", false),
        shpCd("shp_cd", "shpCd", "VARCHAR", false),
        shpPass("shp_pass", "shpPass", "VARCHAR", false),
        shpHdrComId("shp_hdr_com_id", "shpHdrComId", "BIGINT", false),
        shpOpeComId("shp_ope_com_id", "shpOpeComId", "BIGINT", false),
        shpGrpId("shp_grp_id", "shpGrpId", "BIGINT", false),
        shpName("shp_name", "shpName", "VARCHAR", false),
        shpNameKn("shp_name_kn", "shpNameKn", "VARCHAR", false),
        shpZipCd("shp_zip_cd", "shpZipCd", "CHAR", false),
        shpAddr01("shp_addr01", "shpAddr01", "VARCHAR", false),
        shpAddr02("shp_addr02", "shpAddr02", "VARCHAR", false),
        shpAddr03("shp_addr03", "shpAddr03", "VARCHAR", false),
        shpAddr04("shp_addr04", "shpAddr04", "VARCHAR", false),
        shpTel01("shp_tel_01", "shpTel01", "VARCHAR", false),
        shpTel02("shp_tel_02", "shpTel02", "VARCHAR", false),
        shpTel03("shp_tel_03", "shpTel03", "VARCHAR", false),
        shpFax01("shp_fax_01", "shpFax01", "VARCHAR", false),
        shpFax02("shp_fax_02", "shpFax02", "VARCHAR", false),
        shpFax03("shp_fax_03", "shpFax03", "VARCHAR", false),
        shpRemarks("shp_remarks", "shpRemarks", "VARCHAR", false),
        shpAvlDateFr("shp_avl_date_fr", "shpAvlDateFr", "DATE", false),
        shpAvlDateTo("shp_avl_date_to", "shpAvlDateTo", "DATE", false),
        shpDelFlg("shp_del_flg", "shpDelFlg", "CHAR", false),
        shpCdate("shp_cdate", "shpCdate", "DATE", false),
        shpCtime("shp_ctime", "shpCtime", "TIME", false),
        shpCtimestamp("shp_ctimestamp", "shpCtimestamp", "TIMESTAMP", false),
        shpUdate("shp_udate", "shpUdate", "DATE", false),
        shpUtime("shp_utime", "shpUtime", "TIME", false),
        shpUtimestamp("shp_utimestamp", "shpUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        shpUpdateUser("shp_update_user", "shpUpdateUser", "BIGINT", false),
        shpUpdateSysName("shp_update_sys_name", "shpUpdateSysName", "VARCHAR", false),
        shpUpdateClassName("shp_update_class_name", "shpUpdateClassName", "VARCHAR", false),
        shpUpdateMethodName("shp_update_method_name", "shpUpdateMethodName", "VARCHAR", false),
        shpUpdateCrudKbn("shp_update_crud_kbn", "shpUpdateCrudKbn", "CHAR", false),
        shpSysRemarks("shp_sys_remarks", "shpSysRemarks", "VARCHAR", false),
        shpPrfCd("shp_prf_cd", "shpPrfCd", "CHAR", false),
        shpPcMlAddr("shp_pc_ml_addr", "shpPcMlAddr", "VARCHAR", false),
        shpMblMlAddr("shp_mbl_ml_addr", "shpMblMlAddr", "VARCHAR", false),
        shpUpdateAdmin("shp_update_admin", "shpUpdateAdmin", "BIGINT", false),
        shpRptMlAddr("shp_rpt_ml_addr", "shpRptMlAddr", "VARCHAR", false),
        shpInstallDate("shp_install_date", "shpInstallDate", "DATE", false),
        shpComNo("shp_com_no", "shpComNo", "VARCHAR", false),
        shpComName("shp_com_name", "shpComName", "VARCHAR", false);

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