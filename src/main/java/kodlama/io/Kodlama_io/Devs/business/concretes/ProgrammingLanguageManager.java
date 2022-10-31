package kodlama.io.Kodlama_io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama_io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama_io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama_io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int languageId) {
		return programmingLanguageRepository.getById(languageId);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName().isBlank() || programmingLanguage.getName().isEmpty()) {
			System.out.println("Program isimleri boş geçilemez.");
		}
		else {
			for (ProgrammingLanguage programmingLanguages : programmingLanguageRepository.getAll()) {
				if (programmingLanguages.getName().equalsIgnoreCase(programmingLanguage.getName())) {
					System.out.println("Aynı isimden başka programlama dili olamaz.");
				}
			}
		}
		
		programmingLanguageRepository.add(programmingLanguage);
		
		
	}

	@Override
	public void delete(int languageRemoveId) {
		programmingLanguageRepository.delete(languageRemoveId);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName().isBlank() || programmingLanguage.getName().isEmpty()) {
			System.out.println("Program isimleri boş geçilemez.");
		}
		else {
			for (ProgrammingLanguage programmingLanguages : programmingLanguageRepository.getAll()) {
				if (programmingLanguages.getName().equalsIgnoreCase(programmingLanguage.getName())) {
					System.out.println("Aynı isimden başka programlama dili olamaz.");
				}
			}
		}
		
		programmingLanguageRepository.update(programmingLanguage);
		
	}

}
