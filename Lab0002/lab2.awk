BEGIN { 
   FS =";"
   i =0
}
{
    cylinder[i] = $3;
    horsepower[i] = $5;
    i++;
}
END
{
    totalCyl = 0;
    totalHors = 0 ;
    for (y = 1; y < length(cylinder); y++)
    {
    totalCyl += cylinder[y];
    totalHors += horsepower[y];
    }
    print "The average horse power per cylinder in this data set is: " , totalHors/totalCyl; 
}
