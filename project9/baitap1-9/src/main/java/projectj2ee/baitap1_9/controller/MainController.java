package projectj2ee.baitap1_9.controller;

import projectj2ee.baitap1_9.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    // Tạo sẵn một danh sách người dùng mẫu
    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    // Khi người dùng truy cập vào đường dẫn "/personList", hàm này sẽ chạy
    @GetMapping(value = { "/", "/personList" })
    public String personList(Model model) {
        // Đưa danh sách vào Model để Thymeleaf có thể lấy dữ liệu hiển thị lên HTML
        model.addAttribute("persons", persons);

        // Trả về file giao diện có tên là "personList.html"
        return "personList";
    }

    @GetMapping(value = "/addPerson")
    public String showAddPersonPage(Model model) {
        // Gửi một đối tượng Person rỗng sang màn hình để chuẩn bị hứng dữ liệu
        model.addAttribute("person", new Person("", ""));
        return "addPerson";
    }

    // Hàm xử lý dữ liệu sau khi người dùng bấm nút "Add" trên form
    @PostMapping(value = "/addPerson")
    public String savePerson(Model model, @ModelAttribute("person") Person person) {
        String firstName = person.getFirstName();
        String lastName = person.getLastName();

        // Kiểm tra nếu người dùng đã nhập đầy đủ thông tin
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            // Thêm người mới vào danh sách
            persons.add(new Person(firstName, lastName));

            // Chuyển hướng (redirect) về lại trang danh sách
            return "redirect:/personList";
        }

        // Nếu nhập thiếu, báo lỗi và giữ lại trang form
        model.addAttribute("errorMessage", "Vui lòng nhập đầy đủ First Name và Last Name!");
        return "addPerson";
    }
}