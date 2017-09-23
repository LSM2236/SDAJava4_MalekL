package sda;

import com.sun.org.apache.regexp.internal.RE;

import java.util.*;

public class Main {

	public static void main(String[] args) {
				final Map<Integer, Student> students = generateStudentsMap(100);
		final Map<Integer, Result> results = generateResultMap(100);

		Integer topStudentScore = topStudentScore(results);
		System.out.println("Ocena najlepszego studenta: " + topStudentScore);

		String topStudentName = topStudentName(students, results);
		System.out.println("Imie(nazwa) najlepszego studenta: " + topStudentName);

		List<Result> correctedGrades = correctGrades(results);
		System.out.println(correctedGrades);

		List<Student> studentsWithScoreHigherThen50 = getStudentsWithScoreHigherThan50(students, results);
		System.out.println(studentsWithScoreHigherThen50);

		List<String> studentsWithGrades = getStudentsWithGrades(students, results);
		System.out.println(studentsWithGrades);
	}

	static List<String> getStudentsWithGrades(Map<Integer, Student> students, Map<Integer, Result> results) {
		List<String> list = new ArrayList<>();
		for (Result posiadajacy : results.values()) {
			if (students.containsKey(posiadajacy.studentId)) {
				Student student = students.get(posiadajacy.studentId);
				list.add(student.name + posiadajacy.grade);
			}

		}
		return list;
	}


	static List<Result> correctGrades(Map<Integer, Result> results) {
		Collection<Result> values = results.values();
		for (Result ocena : results.values()){
			if (ocena.score <= 20){
				ocena.grade = "E";
			}
			else if (ocena.score <= 40){
				ocena.grade = "D";
			}
			else if (ocena.score <= 60){
				ocena.grade = "C";
			}
			else if (ocena.score <= 80){
				ocena.grade = "B";
			}
			else if (ocena.score <= 100){
				ocena.grade = "A";
			}
		}

		//każda ocena niezależnie od wartości (score), posiada grade = 'A'
		//popraw grade w następujący sposób:
		//score 0 - 20 -> grade E
		//score 21 - 40 -> grade D
		//score 41 - 60 -> grade C
		//score 61 - 80 -> grade B
		//score 81 - 100 -> grade A
		return new ArrayList<>(values);
	}

	static Integer topStudentScore(Map<Integer, Result> results) {
		Collection<Result> values = results.values();
		Result najwyzszy = new Result(0,0,0,"");
		for (Result result : values){
			if (result.score > najwyzszy.score)
				najwyzszy = result;
		}
		return najwyzszy.score;
	}

	static String topStudentName(Map<Integer, Student> students, Map<Integer, Result> results) {
		String name = "nie znaleziono studenta";
		Result najwyzszy = new Result(0,0,0,"");
		int tempId = 0;
		for (Result result : results.values() ){
			if (result.score > najwyzszy.score)
				najwyzszy = result;
				tempId = najwyzszy.resultId;
			if(students.containsKey(tempId)){
				return students.get(tempId).name;
			}
		}
		return name;
	}

	static List<Student> getStudentsWithScoreHigherThan50(Map<Integer, Student> students, Map<Integer, Result> results) {
		List<Student> list = new ArrayList<>();
		List<Result> lista2 = new ArrayList<>();
		for (Result result : results.values()){
			if (result.score > 50 ){
				lista2.add(result);
			}
		}
		for (Result result : lista2){
			if (students.containsKey(result.studentId)){
				Student student = students.get(result.studentId);
				list.add(student);
			}
		}
		//zwróc listę studentów z ocenami wyższymi od 50
		return list;
	}

	static Map<Integer, Student> generateStudentsMap(int size) {
		Map<Integer, Student> students = new HashMap<>(size);
		Random generator = new Random();
		while (size > 0) {
			int studentId = generator.nextInt(100);
			String name = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
			String university = UUID.randomUUID().toString().replaceAll("[^A-Za-z]+", "");
			students.put(studentId, new Student(studentId, name, university));
			size--;
		}
		return students;
	}

	static Map<Integer, Result> generateResultMap(int size) {
		Map<Integer, Result> results = new HashMap<>(size);
		Random generator = new Random();
		while (size > 0) {
			int studentId = generator.nextInt(100);
			int resultId = generator.nextInt(100);
			int score = generator.nextInt(100);
			results.put(studentId, new Result(studentId, resultId, score, "A"));
			size--;
		}
		return results;
	}
}
