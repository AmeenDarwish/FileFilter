package filesprocessing;






/*
This class was created for handling exceptions throughout the programm
Functions:

Type I Errors - Warnings:
If cought print warning message and continue:

1. A bad FILTER/ORDER name (e.g., greaaaater_than). These names are also case-sensitive
(e.g., Size is an illegal order name, and should result in an error).

2. Bad parameters to the hidden/writable/executable filters (anything other than YES/NO).

3. Bad parameters to the greater_than/between/smaller_than filters (negative number).

4. Illegal values for the between filter (for example - between#15#7).


In case there is a warning in the FILTER sub-section, you should behave as if the filter was
all (i.e.,you should match all files).
• In case a type I error occurs in the ORDER sub-section, you should behave as if there was
no order specified (i.e., order by abs).

Type I errors should result in printing "Warning in line X" (print to the standard error using
System.err) and continuing normally.

• If two warnings exist in the same line (i.e., between#2#-1), you should print only one
warning, as you choose.



Type II Errors:

5. Invalid usage (i.e., anything other than two program arguments, where the first is the Source
Directory and the second is the Commands File). You may assume Source Directory
is an existing directory and Commands File is an existing file.


6. I/O problems - errors occurring while accessing the Commands File.

7. A bad sub-section name (i.e., not FILTER/ORDER). Sub-section names are case-sensitive
(e.g., filter is an illegal sub-section name, and should result in an error).

8. Bad format of the Commands File (e.g., no ORDER sub-section).

Type II errors should result in printing "ERROR: " to stderr (using System.err), afterwards
an informative message (with newline) and then returning (Error format - "ERROR: <error
message> \n"). Please refrain from exclamation marks in these error messages. You are
allowed to catch type II errors in the main method and handle them there.


 */







public class ExceptionHandling {
}
