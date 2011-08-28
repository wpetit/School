/**
 * 
 */
package fr.min.school.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import fr.min.school.dao.WorkDAO;
import fr.min.school.model.Work;

/**
 * @author Wilfried Petit
 * 
 */
public class WorkDAOImpl extends HibernateDaoSupport implements WorkDAO {

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.min.school.dao.WorkDAO#findWorkById()
	 */
	@Override
	public Work findWorkById(int id) {
		return (Work) this.getSessionFactory().getCurrentSession()
				.get(Work.class, id);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.min.school.dao.WorkDAO#createWork(fr.min.school.model.Work)
	 */
	@Override
	public void createWork(Work work) {
		this.getSessionFactory().getCurrentSession().save(work);
	}
}
