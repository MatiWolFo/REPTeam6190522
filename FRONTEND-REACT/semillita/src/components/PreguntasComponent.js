import React, { useState } from 'react';
import { Link } from 'react-router-dom'


export default function PreguntasComponent() {
	const questions = [
		{
			questionText: '1) ¿Qué signnifica HTML?',
			answerOptions: [
				{ answerText: 'Hiena Tramposa Mineral Largo', isCorrect: false },
				{ answerText: 'Hipopotamo Tierra Marcial Lengua', isCorrect: false },
				{ answerText: 'Hyper Text Markup Language', isCorrect: true },
				{ answerText: 'Hyper Time Map Legend', isCorrect: false },
			],
		},
		{
			questionText: '2) ¿Cómo se escriben las etiquetas en html?',
			answerOptions: [
				{ answerText: 'A) Apertura ">/body<" cierre "<body>"', isCorrect: false },
				{ answerText: 'B) Apertura "<body>" cierre "</body>"', isCorrect: true },
				{ answerText: 'C) Apertura "</body>" cierre ">body<', isCorrect: false },
				{ answerText: 'D) Apertura ">body<" cierre ">/body<"', isCorrect: false },
			],
		},
		{
			questionText: '3)¿Cuál es la palabra magica con la que empieza la aventura?',
			answerOptions: [
				{ answerText: '<!DOCTYPE html>', isCorrect: true },
				{ answerText: '<!html>', isCorrect: false },
				{ answerText: '<html>', isCorrect: false },
				{ answerText: '</html>', isCorrect: false },
			],
		}
	];

	const [currentQuestion, setCurrentQuestion] = useState(0);
	const [showScore, setShowScore] = useState(false);
	const [score, setScore] = useState(0);

	const handleAnswerOptionClick = (isCorrect) => {
		if (isCorrect) {
			setScore(score + 1);
		}

		const nextQuestion = currentQuestion + 1;
		if (nextQuestion < questions.length) {
			setCurrentQuestion(nextQuestion);
		} else {
			setShowScore(true);
		}
	};
	return (
		<div className='app'>
			{showScore ? (
				<div className='score-section'>
					Acertaste {score} de {questions.length}
					<div className="botonn">
                <span>
                    <Link to="/juego-html" className="siguiente">
                        SIGUIENTE
                    </Link>
                </span>
            </div>
				</div>
			) : (
				<>
					<div className='question-section'>
						<div className='question-count'>
							<span>Question {currentQuestion + 1}</span>/{questions.length}
						</div>
						<div className='question-text'>{questions[currentQuestion].questionText}</div>
					</div>
					<div className='answer-section'>
						{questions[currentQuestion].answerOptions.map((answerOption) => (
							<button onClick={() => handleAnswerOptionClick(answerOption.isCorrect)}>{answerOption.answerText}</button>
						))}
					</div>
				
				</>
			)}
		</div>
		
	);
}
