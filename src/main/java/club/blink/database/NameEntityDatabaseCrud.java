package club.blink.database;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import club.blink.database.entity.DBEntity;
import club.blink.database.entity.NameEntity;

@Repository
@Qualifier("nameEntityDatabaseCrud")
public class NameEntityDatabaseCrud implements InterfaceBasicCrud {

	public NameEntityDatabaseCrud() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DBEntity get(String id) {
		NameEntity ne = new NameEntity();
		ne.setFirstName("Lohit");
		ne.setLastName("Bisen");
		ne.setId(id);
		return ne;
	}

	@Override
	public NameEntity post(DBEntity ne) {
		// TODO Auto-generated method stub
		ne.setId(String.valueOf(Math.random()));
		return (NameEntity) ne;
	}

	@Override
	public void update(DBEntity ne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DBEntity de) {
		// TODO Auto-generated method stub

	}

}
