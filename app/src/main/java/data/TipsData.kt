package com.example.raithavarta.data

data class Tip(
    val crop: String,
    val englishTip: String,
    val kannadaTip: String
)

val tipsList = listOf(
    Tip(
        crop = "Paddy",
        englishTip = "Use proper water management to avoid crop damage.",
        kannadaTip = "ಬೆಳೆ ಹಾನಿ ತಪ್ಪಿಸಲು ಸರಿಯಾದ ನೀರಿನ ನಿರ್ವಹಣೆ ಮಾಡಿ."
    ),
    Tip(
        crop = "Paddy",
        englishTip = "Check leaves regularly for pest attack.",
        kannadaTip = "ಕೀಟ ದಾಳಿಗಾಗಿ ಎಲೆಗಳನ್ನು ನಿಯಮಿತವಾಗಿ ಪರಿಶೀಲಿಸಿ."
    ),
    Tip(
        crop = "Tomato",
        englishTip = "Avoid excess watering to prevent root disease.",
        kannadaTip = "ಬೇರು ರೋಗ ತಪ್ಪಿಸಲು ಹೆಚ್ಚು ನೀರು ಹಾಕಬೇಡಿ."
    ),
    Tip(
        crop = "Tomato",
        englishTip = "Use organic fertilizer for better yield.",
        kannadaTip = "ಉತ್ತಮ ಇಳುವರಿಗಾಗಿ ಸಾವಯವ ಗೊಬ್ಬರ ಬಳಸಿ."
    )
)