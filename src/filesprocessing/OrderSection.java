package filesprocessing;


/*
This sub-section indicates the order in which the filtered files are printed

abs: Sort files by absolute name (using File.getAbsolutePath() ), going from ’a’ to ’z’

type: Sort files by file type, going from ’a’ to ’z’

size: Sort files by file size, going from smallest to largest

#REVERSE SUFFIX:
1. Each order may appear with the trailing #REVERSE suffix. This means that the files
should be printed in the opposite way of the original order. For example, size#REVERSE
should print the files from largest to smallest.

2. The #REVERSE suffix may only appear once per order. You are not required to support
more complex cases (e.g., inputs such as abs#REVERSE#REVERSE), and may support
them or consider them as error, as you prefer (your program will not be tested on such
cases). You may also assume that the #REVERSE suffix always comes after some order



SORTING:


 Full credit will only be given to efficient sorting algorithms. You may
not use any of Java’s built-in sorting methods.


COMMENTS:

1. Each order sub-section starts with a line which consists of the word ORDER, followed by
at most a single line describing the order.
2. As written above, an ORDER sub-section must appear in every section. Otherwise it is an
error

3. An ORDER sub-section may be empty (i.e. the line containing the word "ORDER" is the
last line in the file or is followed by a new "FILTER" line of a new section). In case the
sub-section is empty, the abs order should be used.

4. For string orders (abs and type), use the String.compareTo() method to compare two file
names.

5. In case two or more files are equal according to any of the type and size orders, the abs order
should be used to order them. For example, in size order, two files with the same size should
be ordered by their absolute name.

6. A file without a period in its name is considered to have the empty string as its extension,
i.e. when ordering by type, "file" is considered equal to "file." (this is not the case when
ordering by abs).

7. In case there is more than one period in the file name, you should treat the last one as the
delimiter between the name and the type. (e.g. file.1.txt is of type txt). Please note that
if a file starts with a period and its name does not contain another period (as delimiter), it
should be treated as if the file’s type is the empty string (a period at the start of a filename
represents a hidden file).


 */








public class OrderSection {
}
