package kodlama.io.Kodlama_io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama_io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int languageId);
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int languageRemoveId);
	void update(ProgrammingLanguage programmingLanguage);
}
