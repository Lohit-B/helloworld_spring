package club.blink.database;
import club.blink.database.entity.DBEntity;

public interface InterfaceBasicCrud {
	public DBEntity get(String id);
	public DBEntity post(DBEntity entity);
	public void update(DBEntity entity);
	public void delete(DBEntity entity);	
}
