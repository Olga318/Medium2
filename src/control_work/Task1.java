package control_work;

public class Task1 {
//1) Используйте команды операционной системы Linux и создайте две новых директории –
//        «Игрушки для школьников» и «Игрушки для дошколят»
//    pin@veil:~$ mkdir Игрушки_для_школьников
//    pin@veil:~$ mkdir Игрушки_для_дошколят
//    pin@veil:~$ ls -l
//
//2) Создайте в директории «Игрушки для школьников» текстовые файлы -
//«Роботы», «Конструктор», «Настольные игры»
//
//    pin@veil:~/Игрушки_для_школьников$ cat > Роботы
//    pin@veil:~/Игрушки_для_школьников$ echo "Конструктор" > Конструктор
//    pin@veil:~/Игрушки_для_школьников$ > Настольные_игры
//
//    pin@veil:~/Игрушки_для_школьников$ cd ..
//
//3) Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»
//
//    pin@veil:~$ cd Игрушки_для_дошколят/
//    pin@veil:~/Игрушки_для_дошколят$ touch Мягкие_игрушки
//    pin@veil:~/Игрушки_для_дошколят$ > Куклы
//    pin@veil:~/Игрушки_для_дошколят$ cat > Машинки
//
//    pin@veil:~/Игрушки_для_дошколят$ cd ~
//
//4) Объединить 2 директории в одну «Имя Игрушки»
//
//    pin@veil:~$ mkdir Имя_Игрушки
//    pin@veil:~$ mv Игрушки_для_дошколят/ Игрушки_для_школьников/ Имя_Игрушки/
//
//5) Переименовать директорию «Имя Игрушки» в «Игрушки»
//
//    pin@veil:~$ mv Имя_Игрушки/ Игрушки
//
//6) Просмотреть содержимое каталога «Игрушки».
//
// pin@veil:~/Игрушки$ tree -g
// [pin     ]  .
// └── [pin     ]  Имя_Игрушки
//    ├── [pin     ]  Игрушки_для_дошколят
//    │   ├── [pin     ]  Куклы
//    │   ├── [pin     ]  Машинки
//    │   └── [pin     ]  Мягкие_игрушки
//    └── [pin     ]  Игрушки_для_школьников
//        ├── [pin     ]  Конструктор
//        ├── [pin     ]  настольные
//        ├── [pin     ]  Настольные_игры
//        └── [pin     ]  Роботы
//
// 3 directories, 7 files
//
// 7) Установить и удалить snap-пакет. (Любой, какой хотите)
//
//    pin@veil:~/Игрушки$ sudo snap install gimp
//    gimp 2.10.30 от Snapcrafters установлен
//    pin@veil:~$  sudo snap remove gimp
//    gimp удалён
//
// 8) Добавить произвольную задачу для выполнения каждые 3 минуты
// (Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).
//
//pin@veil:~$ crontab -e
//
//   */3 * * * * echo "Новая запись про очередную игру" >> /tor/Toys
//*/3 * * * * echo "Новая запись про очередную игру" >> /tor/Toys/list.txt
}




















