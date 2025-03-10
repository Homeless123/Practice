package day08_switch;

public class HTTP {
    /*
   HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable
       declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                    output:
                        ok
       	Note: MUST use switch statement
*/
    public static void main(String[] args) {
        int status_code=503;

       String result ="";

       boolean accept=(status_code==200)||(status_code==201)||(status_code==202)
               ||(status_code==301)||(status_code==303)||(status_code==304)||(status_code==307)||(status_code==400)
               ||(status_code==401)||(status_code==403)||(status_code==404)||(status_code==410)||(status_code==500)
               ||(status_code==503);

       switch (status_code){
           case 200:
               System.out.println("OK");
               break;
               case 201:
                   System.out.println("Created");
                   break;
                   case 202:
                       System.out.println("Accepted");
                       break;
                       case 301:
                           System.out.println("Not Modified");
                           break;
                           case 303:
                               System.out.println("See Other");
                               break;
                               case 304:
                                   System.out.println("No Modified");
                                   break;
                                   case 307:
                                       System.out.println("Temporary Redirect");
                                       break;
                                       case 400:
                                           System.out.println("Bad Request");
                                           break;
                                           case 401:
                                               System.out.println("Unauthorized");
                                               break;
                                               case 403:
                                                   System.out.println("Forbidden");
                                                   break;
                                                   case 404:
                                                       System.out.println("Not Found");
                                                       break;
                                                       case 410:
                                                           System.out.println("Gone");
                                                           break;
                                                           case 500:
                                                               System.out.println("Internal Server Error");
                                                               break;
                                                               case 503:
                                                                   System.out.println("Service Unavailable");
                                                                  break;}
        System.out.println(result);
       }





    }
