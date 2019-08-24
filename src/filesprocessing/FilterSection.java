package filesprocessing;



// Only files are returned (not directories)
//Only files that are directly under the source directory are returned
//files that are in directories that are under the source directory should not be returned
//The format for each filter is either NAME, NAME#VALUE or NAME#VALUE#VALUE.
//The #NOT suffix may only appear once per filter
//You may also assume that the #NOT suffix always comes after some filter
//You may assume that there is only one filter after the FILTER line

//The domain for size filters (smaller_than, between and greater_than) is any non-negative
//double number (java double, greater than or equal to 0), which may or may not contain a
//fractional part (i.e., either 5, 5., 0, 124, etc., or 0.111, 532.5, .5, etc.). You may assume that
//the input is a java double but should verify it is a non-negative double


//between filter receives 2 values separated by #. For example, between#10#20 should return
//all files with size greater than (or equal to) 10 and smaller than (or equal to) 20. You
//should validate that the first value is smaller or equal to the second. (i.e., input such as
//between#13#10 is considered illegal, see section 6.1.1).


//1 kb = 1024 bytes.
//For the writable/executable/hidden filters, the domain is YES/NO strings. You need to
//verify this.


//For file, prefix, suffix and contains filters, the domain is any string composed of the legal
//characters described above. You may assume that the input values for these filters do not
//contain illegal characters.

//file filter matches file names equal to the filter value. For example, file#a.txt matches
//files called "a.txt". Comparison is case-sensitive


//contains filter matches file names that contain the filter value. For example, contains#abc
//matches files that have "abc" in their name. Comparison is case-sensitive
public class FilterSection {
    



}






















