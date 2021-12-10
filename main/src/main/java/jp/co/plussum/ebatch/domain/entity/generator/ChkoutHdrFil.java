package jp.co.plussum.ebatch.domain.entity.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChkoutHdrFil implements Serializable {
    private Long cohId;

    private String cohStsKbn;

    private Date cohDate;

    private Date cohEntTime;

    private Integer cohWaitTime;

    private Date cohStrTime;

    private Date cohEndTime;

    private Long cohShpId;

    private Long cohCstId;

    private Long cohStfId;

    private String cohApntFlg;

    private String cohCstKbn;

    private String cohTagNo;

    private Long cohTotalPrice;

    private Long cohTotalTax;

    private String cohRemarks;

    private Date cohAvlDateFr;

    private Date cohAvlDateTo;

    private String cohDelFlg;

    private Date cohCdate;

    private Date cohCtime;

    private Date cohCtimestamp;

    private Date cohUdate;

    private Date cohUtime;

    private Date cohUtimestamp;

    private Long versionNo;

    private Long cohUpdateUser;

    private String cohUpdateSysName;

    private String cohUpdateClassName;

    private String cohUpdateMethodName;

    private String cohUpdateCrudKbn;

    private String cohSysRemarks;

    private Long cohBefId;

    private Date cohReservStrTime;

    private Date cohReservEndTime;

    private Integer cohRaitenKaisu;

    private Long cohRaitenKankaku;

    private String cohReceiptRemarks;

    private String cohKaijyoRemarks;

    private Date cohExptFinishTime;

    private String cohVisitMot;

    private Long cohRsvId;

    private String cohRsvRteSbt;

    private String cohRsvTel01;

    private String cohRsvTel02;

    private String cohRsvTel03;

    private String cohRsvMlAddr;

    private String cohRsvQstAns;

    private String cohRsvReqCns;

    private Long cohPrePaidPrice;

    private Long cohSeatId;

    private static final long serialVersionUID = 1L;

    public enum Column {
        cohId("coh_id", "cohId", "BIGINT", false),
        cohStsKbn("coh_sts_kbn", "cohStsKbn", "CHAR", false),
        cohDate("coh_date", "cohDate", "DATE", false),
        cohEntTime("coh_ent_time", "cohEntTime", "TIME", false),
        cohWaitTime("coh_wait_time", "cohWaitTime", "NUMERIC", false),
        cohStrTime("coh_str_time", "cohStrTime", "TIME", false),
        cohEndTime("coh_end_time", "cohEndTime", "TIME", false),
        cohShpId("coh_shp_id", "cohShpId", "BIGINT", false),
        cohCstId("coh_cst_id", "cohCstId", "BIGINT", false),
        cohStfId("coh_stf_id", "cohStfId", "BIGINT", false),
        cohApntFlg("coh_apnt_flg", "cohApntFlg", "CHAR", false),
        cohCstKbn("coh_cst_kbn", "cohCstKbn", "CHAR", false),
        cohTagNo("coh_tag_no", "cohTagNo", "VARCHAR", false),
        cohTotalPrice("coh_total_price", "cohTotalPrice", "NUMERIC", false),
        cohTotalTax("coh_total_tax", "cohTotalTax", "NUMERIC", false),
        cohRemarks("coh_remarks", "cohRemarks", "VARCHAR", false),
        cohAvlDateFr("coh_avl_date_fr", "cohAvlDateFr", "DATE", false),
        cohAvlDateTo("coh_avl_date_to", "cohAvlDateTo", "DATE", false),
        cohDelFlg("coh_del_flg", "cohDelFlg", "CHAR", false),
        cohCdate("coh_cdate", "cohCdate", "DATE", false),
        cohCtime("coh_ctime", "cohCtime", "TIME", false),
        cohCtimestamp("coh_ctimestamp", "cohCtimestamp", "TIMESTAMP", false),
        cohUdate("coh_udate", "cohUdate", "DATE", false),
        cohUtime("coh_utime", "cohUtime", "TIME", false),
        cohUtimestamp("coh_utimestamp", "cohUtimestamp", "TIMESTAMP", false),
        versionNo("version_no", "versionNo", "BIGINT", false),
        cohUpdateUser("coh_update_user", "cohUpdateUser", "BIGINT", false),
        cohUpdateSysName("coh_update_sys_name", "cohUpdateSysName", "VARCHAR", false),
        cohUpdateClassName("coh_update_class_name", "cohUpdateClassName", "VARCHAR", false),
        cohUpdateMethodName("coh_update_method_name", "cohUpdateMethodName", "VARCHAR", false),
        cohUpdateCrudKbn("coh_update_crud_kbn", "cohUpdateCrudKbn", "CHAR", false),
        cohSysRemarks("coh_sys_remarks", "cohSysRemarks", "VARCHAR", false),
        cohBefId("coh_bef_id", "cohBefId", "BIGINT", false),
        cohReservStrTime("coh_reserv_str_time", "cohReservStrTime", "TIME", false),
        cohReservEndTime("coh_reserv_end_time", "cohReservEndTime", "TIME", false),
        cohRaitenKaisu("coh_raiten_kaisu", "cohRaitenKaisu", "NUMERIC", false),
        cohRaitenKankaku("coh_raiten_kankaku", "cohRaitenKankaku", "NUMERIC", false),
        cohReceiptRemarks("coh_receipt_remarks", "cohReceiptRemarks", "VARCHAR", false),
        cohKaijyoRemarks("coh_kaijyo_remarks", "cohKaijyoRemarks", "VARCHAR", false),
        cohExptFinishTime("coh_expt_finish_time", "cohExptFinishTime", "TIME", false),
        cohVisitMot("coh_visit_mot", "cohVisitMot", "CHAR", false),
        cohRsvId("coh_rsv_id", "cohRsvId", "BIGINT", false),
        cohRsvRteSbt("coh_rsv_rte_sbt", "cohRsvRteSbt", "CHAR", false),
        cohRsvTel01("coh_rsv_tel_01", "cohRsvTel01", "VARCHAR", false),
        cohRsvTel02("coh_rsv_tel_02", "cohRsvTel02", "VARCHAR", false),
        cohRsvTel03("coh_rsv_tel_03", "cohRsvTel03", "VARCHAR", false),
        cohRsvMlAddr("coh_rsv_ml_addr", "cohRsvMlAddr", "VARCHAR", false),
        cohRsvQstAns("coh_rsv_qst_ans", "cohRsvQstAns", "VARCHAR", false),
        cohRsvReqCns("coh_rsv_req_cns", "cohRsvReqCns", "VARCHAR", false),
        cohPrePaidPrice("coh_pre_paid_price", "cohPrePaidPrice", "NUMERIC", false),
        cohSeatId("coh_seat_id", "cohSeatId", "BIGINT", false);

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