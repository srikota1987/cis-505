import java.util.ArrayList;
import java.util.List;

/*
Srilakshmi, K. (2022). Intermediate Java Programming - MemComposerDao class.
Created by Srilakshmi Kota
*/
public class MemComposerDao implements ComposerDao { 
	
	private List<Composer> composers = new ArrayList<Composer>();
	
	// Default Product
	public MemComposerDao() {
		Composer composer1 = new Composer(1007, "Ludwig Van Bethvoeen", "Classical");
		Composer composer2 = new Composer(1008, "Johann Sebastian Bach", "Classical");
		Composer composer3 = new Composer(1009, "Wolfgang Amadues Mozart", "Classical");
		Composer composer4 = new Composer(1010, "Johannes Brahms", "Classical");
		Composer composer5 = new Composer(1011, "Joseph Haydn", "Classical");
		composers.add(composer1);
		composers.add(composer2);
		composers.add(composer3);
		composers.add(composer4);
		composers.add(composer5);
	}

	@Override
	public List<Composer> findAll() {
			return composers;
	}

	@Override
	public Composer findBy(Integer key) {
		for(Composer composer : composers) {
			if(key.equals(composer.getId())) {
				return composer;
			}
		}
		return null;
	}

	@Override
	public void insert(Composer entity) {
		composers.add(entity);
	}

}
