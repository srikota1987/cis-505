import java.util.List;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - GenericDao class.
    Created by Srilakshmi Kota
*/
public interface GenericDao<E, K> {
	
	List<E> findAll();
	E findBy(K Key);
	void insert(E entity);

}
