import pyttsx3
import speech_recognition as sr
import datetime
import os
import wikipedia
import pywhatkit
import pyautogui
import pyjokes

engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
engine.setProperty('voice', voices[0].id)

def speak(audio):
    engine.say(audio)
    engine.runAndWait()

def wishings():
    hour = int(datetime.datetime.now().hour)
    if hour>=0 and hour<12:
        print("Assalwalaikum, Good Morning Boss")
        speak("Assalwalaikum, Good Moring Boss")
    elif hour>=12 and hour<17:
        print("Assalwalaikum, Good Afternoon Boss")
        speak("Assalwalaikum, Good Afternoon Boss")
    elif hour>=17 and hour<21:
        print("Assalwalaikum, Good Evening Boss")
        speak("Assalwalaikum, Good Evening Boss")
    else:
        print("Assalwalaikum, Good Night Boss")
        speak("Assalwalaikum, Good Night Boss")
    speak("I am Jarvis your voice assistant! ")

def commands():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        speak("How can I help You Boss?")
        print("Listening....")
        r.pause_threshold = 1
        r.adjust_for_ambient_noise(source, duration=1)
        audio = r.listen(source)

    try:
        print("wait for few moments...")
        query=r.recognize_google(audio, language='en-in')
        print(f"You just said: {query}\n")
    except Exception as e:
        print(e)
        speak("Please Tell me again")
        query = "none"
    return query

if __name__ == "__main__":
    wishings()
    query=commands().lower()
    if 'time' in query:
            strTime = datetime.datetime.now().strftime("%H:%M:%S")
            print(strTime)
            speak(f"Boss, the time is {strTime}")

    elif 'open microsoft edge' in query:
            speak("Opening Microsoft Edge Application Boss...")
            os.startfile("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe")
        
    elif 'wikipedia' in query:
            speak("searching in Wikipedia...")
            try:
                query=query.replace("wikipedia","")
                results = wikipedia.summary(query,sentences=1)
                speak("According to wikipedia,")
                print(results)
                speak(results)
            except:
                speak("No results found..")
                print("No results found.")
        
    elif 'play' in query:
            query=query.replace('play', '')
            speak('Playing '+ query)
            pywhatkit.playonyt(query)
        
    elif 'type' in query:
            os.startfile("C:\\Users\\syedf\\Desktop\\jarvis_file.txt")
            speak("Please tell me what should i write")
            while True:
                writeInNotepad=commands()
                if writeInNotepad=='exit typing':
                    speak("Done boss")
                else:
                    pyautogui.write(writeInNotepad)

    elif 'joke' in query:
            joke = pyjokes.get_joke()
            print(joke)
            speak(joke)

    elif 'exit program' in query:
            speak("I am leaving Boss, Khudha Hafiz!")
            quit()