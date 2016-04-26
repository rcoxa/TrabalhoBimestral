package br.univel;

public abstract class SqlGen {
	// DDL
	protectedabstract String getCreateTable(Connection con, Object obj);
	protectedabstract String getDropTable(Connection con, Object obj);
	// DML
	protectedabstract PreparedStatement getSqlInsert(Connection con, Object obj);
	protectedabstract PreparedStatement getSqlSelectAll(Connection con, Object obj);
	protectedabstract PreparedStatement getSqlSelectById(Connection con, Object obj);
	protectedabstract PreparedStatement getSqlUpdateById(Connection con, Object obj);
	protectedabstract PreparedStatement getSqlDeleteById(Connection con, Object obj);
	}