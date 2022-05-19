package Service;

import java.util.ArrayList;
import java.util.List;

import interfaces.registration;
import obj.Krs;
import obj.Student;

public class registrationImpl implements registration {
    List<Student> siswa = new ArrayList<>();
    List<Krs> krsSiswa = new ArrayList<>();
    Integer totalSks = 0;

    @Override
    public String regisStudent(Student siswaInput) {
        siswa.add(siswaInput);
        return "Registrasi Berhasil";
    }

    @Override
    public String inputKrs(Integer krs, String namaMatkul, int index) {
        Student studentKrs = siswa.get(index);
        Krs krsStudent = new Krs(krs, namaMatkul, studentKrs.getFirstName());
        krsSiswa.add(krsStudent);
        for (int i = 0; i < krsSiswa.size(); i++) {
            if(krsSiswa.get(i).getNamaSiswa().equals(studentKrs.getFirstName())){
                totalSks += krsSiswa.get(i).getSks();
                System.out.println("total sks yang nama sama: " + totalSks);
            }
        }
        studentKrs.setSks(totalSks);
        totalSks = 0;
        return "KRS Input Success Mahasiswa " + studentKrs.getFirstName();
    }

}
