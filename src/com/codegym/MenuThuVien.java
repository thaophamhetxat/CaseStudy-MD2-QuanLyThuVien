package com.codegym;

import com.codegym.gopY.ManagerGopY;
import com.codegym.validate.ValidatePassWordPerson;
import java.io.*;
import java.util.*;

public class MenuThuVien {
    ManagerThuVien managerThuVien = new ManagerThuVien(nameFile1);
    ManagerGopY managerGopY = new ManagerGopY();
    static Scanner scanner = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    ValidatePassWordPerson validatePassWordPerson = new ValidatePassWordPerson();

    static String nameFile1;
    static String passWord1;

    public MenuThuVien() throws IOException, ClassNotFoundException {
    }

    public void menu() throws IOException, ClassNotFoundException {
        Date date = cal.getTime();
        while (true) {
            System.out.println("╔=======================================================╗");
            System.out.println("║          ▂ ▃ ▅ ▆ █ QUẢN LÝ THƯ VIỆN █ ▆ ▅ ▃ ▂         ║");
            System.out.println("╠=======================================================╣");
            System.out.println("║>>>>>>>>>>Chọn 1 tính năng bên dưới để tiếp tục:<<<<<<<║");
            System.out.println("║>[0]. Giới thiệu.                                      ║");
            System.out.println("║>[1]. Hiển thị danh sách thư viện.                     ║");
            System.out.println("║>[2]. Thêm tài liệu.                                   ║");
            System.out.println("║>[3]. Sửa tài liệu.                                    ║");
            System.out.println("║>[4]. Tìm kiếm tài liệu.                               ║");
            System.out.println("║>[5]. Xóa tài liệu                                     ║");
            System.out.println("║>[6]. Xắp xếp tài liệu.                                ║");
            System.out.println("║>[7]. Tool.                                            ║");
            System.out.println("║>[8]. Hỗ trợ người dùng.                               ║");
            System.out.println("║>[9]. Thoát.                                           ║");
            System.out.println("╚======═================================================╝");
            System.out.print(">>>Chọn: ");
            final int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1: {
                    managerThuVien.displayTaiLieu();
                    break;
                }
                case 2: {
                    System.out.println("*====================================*");
                    System.out.println("|     CHỌN LOẠI TÀI LIỆU CẦN THÊM.   |");
                    System.out.println("*====================================*");
                    System.out.println("|     [1]. Thêm sách.                |");
                    System.out.println("|     [2]. Thêm tạp chí.             |");
                    System.out.println("|     [3]. Thêm báo.                 |");
                    System.out.println("*====================================*");
                    System.out.print("     >>>Chọn: ");
                    final int selected1 = Integer.parseInt(scanner.nextLine());
                    switch (selected1) {
                        case 1: {
                            managerThuVien.themTaiLieu("SachTaiLieu");
                            break;
                        }
                        case 2: {
                            managerThuVien.themTaiLieu("TapChi");
                            break;
                        }
                        case 3: {
                            managerThuVien.themTaiLieu("Bao");
                            break;
                        }
                    }
                }
                break;
                case 3: {
                    managerThuVien.editTaiLieu();
                }
                break;
                case 4: {
                    managerThuVien.searchTaiLieu();
                    break;
                }
                case 5: {
                    managerThuVien.deleteTaiLieu();
                    break;
                }
                case 6: {
                    managerThuVien.sortMaTaiLieu();
                    break;
                }
                case 7: {
                    System.out.println("*====================================*");
                    System.out.println("|                TOOL                |");
                    System.out.println("*====================================*");
                    System.out.println("|     [1]. Ghi file.                 |");
                    System.out.println("|     [2]. Đọc file.                 |");
                    System.out.println("|     [3]. Remove account            |");
                    System.out.println("|     [4]. Show info Person          |");
                    System.out.println("|     [5]. LogOut                    |");
                    System.out.println("* ===================================*");
                    System.out.print("     >>>Chọn: ");
                    final int selected2 = Integer.parseInt(scanner.nextLine());
                    switch (selected2) {
                        case 1: {
                            ManagerThuVien.writeToFile();
                            System.out.println(">>>>>>>>>>>>>>[ĐÃ LƯU]");
                            break;
                        }
                        case 2: {
                           ManagerThuVien.readDataFromList();
                            for (ThuVien thuVien : ManagerThuVien.list) {
                                System.out.println(thuVien);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Đã xóa tài khoản " + nameFile1);
                            ManagerUserPerson.removeUser(nameFile1);
                            start();
                            break;
                        }
                        case 4: {
                            System.out.println("*==============================*");
                            System.out.println("|  UserName: " + nameFile1 + "|");
                            System.out.println("|  PassWord: " + passWord1 + "|");
                            System.out.println("|  Thời gian truy cập: " + date + "|");
                            System.out.println("*==============================*");
                            break;
                        }
                        case 5: {
                            start();
                        }
                        break;
                    }
                }
                break;
                case 9: {
                    System.out.println("*====================================*");
                    System.out.println("|        Bạn có chắc muốn thoát      |");
                    System.out.println("*====================================*");
                    System.out.println("|     [1]. Quay lại.                 |");
                    System.out.println("|     [2]. Thoát.                    |");
                    System.out.println("* ===================================*");
                    System.out.print("     >>>Chọn: ");
                    final int selected3 = Integer.parseInt(scanner.nextLine());
                    switch (selected3) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.exit(0);
                    }
                }
                case 0: {
                    System.out.println("*====================================*");
                    System.out.println("|               GIỚI THIỆU           |");
                    System.out.println("*====================================*");
                    System.out.println("|     [1]. Thông tin sản phẩm.       |");
                    System.out.println("|     [2]. Hướng dẫn sử dụng.        |");
                    System.out.println("|     [3]. Quay lại.                 |");
                    System.out.println("* ===================================*");
                    System.out.print("     >>>Chọn: ");
                    final int selected4 = Integer.parseInt(scanner.nextLine());
                    switch (selected4) {
                        case 1: {
                            System.out.println(">>>[------------------------------------------------------------------------]<<<");
                            System.out.println(">>>[                                 GIỚI  THIỆU                            ]<<<");
                            System.out.println(">>>[------------------------------------------------------------------------]<<<");
                            System.out.println(">>>[ Tác giả: Phạm Thế Thao                                                 ]<<<");
                            System.out.println(">>>[ Lớp: c0421k1                                                           ]<<<");
                            System.out.println(">>>[ Giới thiệu: Đây là sản phẩm có mục đích là quản lý sách trong thư viện ]<<<");
                            System.out.println(">>>[ và được tạo ra để khoe với anh em trong buổi show cas study 2          ]<<<");
                            System.out.println(">>>[------------------------------------------------------------------------]<<<");
                        }
                        break;
                        case 2: {
                            System.out.println(">>>[------------------------------------------------------------------------]<<<");
                            System.out.println(">>>[                           HƯỚNG DẪN SỦ DỤNG                            ]<<<");
                            System.out.println(">>>[------------------------------------------------------------------------]<<<");
                            System.out.println(">>>[ chọn 1 trong các tính năng có trong menu tương ứng với các số thứ tự   ]<<<");
                            System.out.println(">>>[1,2,3 .. để sử dụng                                                     ]<<<");
                            System.out.println(">>>[ví dụ: muốn xem danh sách thông tin:   chọn [1]->OK->danh sách hiển thị ]<<<");
                            System.out.println(">>>[------------------------------------------------------------------------]<<<");
                        }
                        break;
                        case 3:
                            menu();
                            break;
                    }
                }
                break;
                case 8: {
                    System.out.println("*====================================*");
                    System.out.println("|          HỖ TRỢ KHÁCH HÀNG         |");
                    System.out.println("*====================================*");
                    System.out.println("|     [1]. Đóng góp ý kiến.          |");
                    System.out.println("|     [2]. Kiểm tra thư đã gửi.      |");
                    System.out.println("|     [3]. Đánh giá.                 |");
                    System.out.println("|     [4]. Quay lại.                 |");
                    System.out.println("* ===================================*");
                    System.out.print("     >>>Chọn: ");
                    final int selected5 = Integer.parseInt(scanner.nextLine());
                    switch (selected5) {
                        case 1: {
                            managerGopY.themMail("mail");
                            managerGopY.writeMail();
                            System.out.println(">>>>>>>>>[ĐÃ GỬI]<<<<<<<<<<");
                            System.out.println(">>>>>>>>>[Chúng tôi sẽ gửi lại phản hồi cho bạn sau]<<<<<<<<<<");
                            break;
                        }
                        case 2:
                            managerGopY.show();
                            break;
                        case 4:
                            menu();
                            break;
                        case 3: {
                            System.out.println("*==========================================*");
                            System.out.println("|   Bạn đánh giá sản phẩm này như thế nào  |");
                            System.out.println("*==========================================*");
                            System.out.println("|     [5].     ★★★★★                     |");
                            System.out.println("|     [4].     ★★★★                       |");
                            System.out.println("|     [3].     ★★★                        |");
                            System.out.println("|     [2].     ★★                          |");
                            System.out.println("|     [1].     ★                           |");
                            System.out.println("* =========================================*");
                            System.out.print("     >>>Chọn: ");
                            final int selected6 = Integer.parseInt(scanner.nextLine());
                            switch (selected6) {
                                case 1:
                                    System.out.println(" (U_U)  cảm ơn bạn, tôi xin lỗi về vấn đề bạn gặp phải...");
                                    break;
                                case 2:
                                    System.out.println(" (O_O)  Cảm ơn bạn đã đánh giá");
                                    break;
                                case 3:
                                    System.out.println(" (n_n)  Cảm ơn bạn, chúc bạn sử dụng vui vẻ");
                                    break;
                                case 4:
                                    System.out.println(" (^_^)  cảm ơn bạn!");
                                    break;
                                case 5:
                                    System.out.println(" w(^o^)w  THANKS YOU!");
                                    break;
                            }
                        }
                    }
                }
                break;
                default: {
                    menu();
                }
                break;
            }

        }
    }

    public void start() throws IOException, ClassNotFoundException {
        File file = new File("user.csv");

        if (!file.exists()) {
            ManagerUserPerson.listUser.add(new UserPerson("admin", "admin"));
            ManagerUserPerson.writeFileUser();
        }
        ManagerUserPerson.readFileUser();
        System.out.println("*====================================*");
        System.out.println("|                LOGIN               |");
        System.out.println("*====================================*");
        System.out.println("|     [1]. Đăng nhập.                |");
        System.out.println("|     [2]. Đăng kí.                  |");
        System.out.println("* ===================================*");
        System.out.print("     >>>Chọn: ");
        int choose = Integer.parseInt(scanner.nextLine());
        while (true) {
            switch (choose) {
                case 1: {
                    int check1 = -1;
                    while (true) {
                        System.out.println(">>>Username: ");
                        String userName = scanner.nextLine();
                        for (int i = 0; i < ManagerUserPerson.listUser.size(); i++) {
                            if (ManagerUserPerson.listUser.get(i).getUserName().equals(userName)) {
                                while (true) {
                                    System.out.println(">>>Password: ");
                                    String password = scanner.nextLine();
                                    if (password.isEmpty()) {
                                        System.out.println("Mật khẩu không được để trống! Mời nhập lại");
                                    } else if (ManagerUserPerson.listUser.get(i).getPassword().equals(password)) {
                                        nameFile1 = userName;
                                        System.out.println(">>>>>>>>>>>[Loading....1....17%....29%...50%...87%...100%]");
                                        System.out.println("[************ WELCOME TO " + userName.toUpperCase() + " *************]");
                                        check1 = 1;
                                        passWord1 = password;
                                        break;
                                    } else {
                                        System.out.println("[***sai pass***]");
                                    }
                                }
                                break;
                            }
                        }
                        if (check1 > 0) {
                            break;
                        }
                        System.out.println("[***sai user***]");
                    }
                }
                break;
                case 2: {
                    while (true) {
                        System.out.println(">>>Username: ");
                        String userName = scanner.nextLine();
                        int check = -1;
                        for (int i = 0; i < ManagerUserPerson.listUser.size(); i++) {
                            if (ManagerUserPerson.listUser.get(i).getUserName().equals(userName)) {
                                check = i;
                            }
                        }
                        if (check > 0) {
                            System.out.println(">>>>>>[ Tên đăng nhập đã tồn tại! ]<<<<<<");
                        } else {
                            while (true) {
                                System.out.println(">>>Password: ");
                                String password = scanner.nextLine();
                                if (password.isEmpty()) {
                                    System.out.println("Pass không được để trống");
                                } else if (!validatePassWordPerson.PassWordPerson(password)) {
                                    System.out.println("PassWord không hợp lệ");
                                    System.out.println(">>>[CHÚ Ý]: PassWord phải từ 6-12 ký tự và phải chứa các ký tự (a,A,@,1,..)");
                                } else {
                                    UserPerson userPerson = new UserPerson(userName, password);
                                    ManagerUserPerson.listUser.add(userPerson);
                                    ManagerUserPerson.writeFileUser();
                                    nameFile1 = userName;
                                    System.out.println(">>>>>>>>>>>[Đã lưu]");
                                    System.out.println(">>>>>>>>>>>[Loading....1....17%....29%...50%...87%...100%]");
                                    System.out.println("[************ WELCOME " + userName.toUpperCase() + " *************]");
                                    passWord1 = password;
                                    break;
                                }
                            }

                        }
                        break;
                    }
                }
                break;
                default: {
                    System.out.println("CHỌN SAI MỜI CHỌN LẠI");
                    start();
                }
            }
            break;
        }
    }


}
