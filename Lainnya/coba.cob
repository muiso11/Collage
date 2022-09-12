      *****************************************************************
      * Program name:    MYPROG                               
      * Original author: MYNAME                                
      *
      * Maintenence Log                                              
      * Date      Author        Maintenance Requirement               
      * --------- ------------  --------------------------------------- 
      * 01/01/08 MYNAME  Created for COBOL class         
      *                                                               
      *****************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID.  MYPROG.
       AUTHOR. MYNAME. 
       INSTALLATION. COBOL DEVELOPMENT CENTER. 
       DATE-WRITTEN. 01/01/08. 
       DATE-COMPILED. 01/01/08. 
       DATA DIVISION. 
       WORKING-STORAGE SECTION. 
       77 x PIC 99 VALUE 1.
       PROCEDURE DIVISION. 
       MULAI.
           IF x < 5
              Go to Para2. 
           GO TO SELESAI.
       Para2.
           DISPLAY 'Ini coba coba' x.
           COMPUTE x =  x + 1.
           GO TO MULAI.
       SELESAI.
           STOP RUN.
      *****************************************************************