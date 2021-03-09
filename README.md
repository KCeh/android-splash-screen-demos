# Android Splash Screen Demos

## Simple Splash Screen
Uses theme (styles.xml) to show splash screen. Simple but effective way.
<br>
<img src="/readme/simple-splash.gif" alt="Splash demo gif" width="320" height="640"/>

## Animated Splash Screen with Handler
This approach allows for animations because we are using proper activity layout. Handler makes sure to route user to next activity. Also you can skip initial blank screen by using same theme trick which is shown in previous example. Problems with this approach are mainly due to usage of Handler (which is deprecated!).
<br>
<img src="/readme/animated-splash-with-handler.gif" alt="Splash demo2 gif" width="320" height="640"/>
