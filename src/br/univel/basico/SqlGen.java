package br.univel.basico;

import java.sql.Connection;
import java.sql.PreparedStatement;

public abstract class SqlGen {
	// DDL
	protected abstract String getCreateTable(Connection con, Object obj);
	protected abstract String getDropTable(Connection con, Object obj);
	// DML
	protected abstract PreparedStatement getSqlInsert(Connection con, Object obj);
	protected abstract PreparedStatement getSqlSelectAll(Connection con, Object obj);
	protected abstract PreparedStatement getSqlSelectById(Connection con, Object obj);
	protected abstract PreparedStatement getSqlUpdateById(Connection con, Object obj);
	protected abstract PreparedStatement getSqlDeleteById(Connection con, Object obj);
}