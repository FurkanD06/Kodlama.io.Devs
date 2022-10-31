package kodlama.io.Kodlama_io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama_io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama_io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguage> languages;
	
	

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"C#"));
		languages.add(new ProgrammingLanguage(2,"Java"));
		languages.add(new ProgrammingLanguage(3,"Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int languageId) {
		return languages.get(languageId);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
		
	}

	@Override
	public void delete(int languageRemoveId) {
		ProgrammingLanguage delete = getById(languageRemoveId);
		if (delete != null) {
			languages.remove(languageRemoveId);
			return;
		}
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage programmingLanguages : languages) {
			if (programmingLanguages.getId() == programmingLanguage.getId()) {
				programmingLanguages.setName(programmingLanguage.getName());
		        break;
			}
		}
		
	}

}
