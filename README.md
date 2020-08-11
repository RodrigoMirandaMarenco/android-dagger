# Using Dagger in your Android app

Please follow the instructions in 
[Dagger Code lab](https://codelabs.developers.google.com/codelabs/android-dagger/#0)
to complete the Android Dagger code lab. 


[Original Repository](https://github.com/googlecodelabs/android-dagger)



# Dagger Pros
1. One of Google's recommended tools (tons of support and online resources)
2. Great performance.
3. A high percentage of 10K+ installs apps in the Play Store use Dagger.
4. A high number of potential staffing gigs with clients.

# Dagger Tips
1. @Binds != data binding
2. @Inject: Used to tell Dagger how to instantiate a class and ALSO used to tell Dagger to inject a Field into a class.
3. When using Activities, inject Dagger in the Activity's onCreate method before calling super.onCreate to avoid issues with fragment restoration.
4. A Fragment injects Dagger in the onAttach method after calling super
5. Dagger-injected fields cannot be private
6. Subcomponents are components that inherit and extend the object graph of a parent component
7. Scope annotations should be named after the lifecycle they adhere to.
8. @Module != Gradle Module



