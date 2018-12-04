package web.dao;

import java.util.List;

import web.dao.util.SqlHelper;
import web.entity.Record;

/**
 * 	支付记录	数据层
 */
public class RecordDao {
	private static final String TABLENAME = "T_Record";

	/**
	 * 插入支付记录
	 */
	public int insertRecord(Record record) {
		return SqlHelper.executeInsert(TABLENAME, record);
	}

	/**
	 * 通过主键删除支付记录
	 */
	public int deleteRecord(Integer mPaymentId) {
		return SqlHelper.executeNoQuery("delete from " + TABLENAME + " where mPaymentId=" + mPaymentId);
	}

	/**
	 * 执行更新支付记录
	 */
	public int updateRecord(Record record) {
		return SqlHelper.executeUpdate(TABLENAME, record, "where mPaymentId=" + record.getmPaymentId());
	}

	/**
	 * 查询所有支付记录
	 */
	public List<Record> selectRecord() {
		return SqlHelper.executeQuery(Record.class, "select * from " + TABLENAME);
	}

	/**
	 * 通过主键查询单个支付记录
	 */
	public Record selectRecord(Integer mPaymentId) {
		return SqlHelper.executeQueryOne(Record.class,
				"select * from " + TABLENAME + " where mPaymentId=" + mPaymentId);
	}

}