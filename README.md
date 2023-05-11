# Banker's-Algorithm
   An implementation for banker algorithm with 3 processes and 3 resources as an android mobile application using java programming language 
and android studio.
   As shown in the video the application consists of four activities(screens) the user enters the current alloction of the processes with 
the resources in the first screen then the current allocation is pushed to the third and fourth activity(ti will be used there).
   Then the user moves to the second activity to enter the total available of each process with each resource and it is pushed to the third
activity.
   Then the user moves to the third acttivity and by clicking on "calculate" button the maximmum need is calculated(total available - current 
allocation) (it is calculated for the halting problem).
   Then the user moves to the fourth activity to enter the available of each resource, then the user enters the process that want to request
resources then the user enters the amount that the process need from each resource.
   At the end, using the banker algorithm the application specifies weather the process is allowed to take this amount of resources or not if
it is allowed, the app puts the process in the safe side and adds the current allocation of the process on the old available and this will be
the new available of the resources.on the other hand, if the process requests an amount of resources more than the available,the process is 
not allowed to take this amount and the app prints "NO AVAILABLE RESOURCES" message.

                   
                                                       (SORRY IF THE GUI IS A BIT MESSY)
