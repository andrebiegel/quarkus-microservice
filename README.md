# Quarkus IO MicroService Sample

Using : 
* Graal VM 20.0 JDK 11
* a lot of quarkus extensions


Providing: 
* JAX-RS Resource
* Microprofil Liveness
* Swagger UI 
...

Was build upon https://github.com/AdamBien/quarkee-archetype
```
./buildNativeContainer.sh
```

![Startup time](images/startup.PNG)

Be carefull the docker build is hungry. If it has RuntimeExceptions with exitcode 137 , it needs more memory.
![usage](images/usage.PNG)


