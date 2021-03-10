# Android Splash Screen Demos

## Simple Splash Screen
Uses theme (styles.xml) to show static splash screen. Simple but effective way.
<br>
<img src="/readme/simple-splash.gif" alt="Splash demo gif" width="320" height="640"/>

## Animated Splash Screen with Handler
This approach uses Handler with fixed timeout and animations to make splash screen fancier. Runnable makes sure to route user to next activity. Also you can skip initial blank screen by using same theme trick which is shown in previous example. Problems (memory leaks etc.) with this approach are mainly due to usage of Handler (which is deprecated!).
<br>
<img src="/readme/animated-splash-with-handler.gif" alt="Splash demo2 gif" width="320" height="640"/>

## Animated Splash Screen with Coroutine
Solves problems with Handler by using Kotlin Coroutines. Also uses theme to impove splash screen (initial blank screen is replaced by background).
<br>
<img src="/readme/animated-splash-with-coroutine.gif" alt="Splash demo3 gif" width="320" height="640"/>
