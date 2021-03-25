/*
1. Определить интерфейс Editor, содержащий 3 метода, методы придумываете сами.
Добавить 1 дефолтный метод. Создать 3 класса-редактора (к примеру: word, notepad...)
Создать массив, содержащий объекты такого интерфейса
 */
import java.util.Date;
public interface Editor {
    String sum(String str1, String str2);
    String upper(String str1);
    String lower(String str2);
    default Date dateParse() {
        return new Date();
    }
    public static void main(String[] args) {
        Editor []ed = new Editor[3];
        ed[0] = new Notepad();
        ed[1] = new Word();
        ed[2] = new Simplenote();
        for (int i = 0; i < 3; i++) {
            System.out.println(ed[i].sum("abc", "123"));
            System.out.println(ed[i].upper("abc"));
            System.out.println(ed[i].lower("ABC"));
        }

    }
}
