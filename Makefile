APP_NAME=BernardoGameLauncher

build:
	./gradlew assembleDebug

release:
	./gradlew assembleRelease

install:
	./gradlew installDebug

clean:
	./gradlew clean

run:
	adb shell am start -n com.bernardo.gamelauncher/.MainActivity

logcat:
	adb logcat

apk:
	ls app/build/outputs/apk/debug/

all: clean build install
