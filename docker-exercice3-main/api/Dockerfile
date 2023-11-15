FROM python

WORKDIR /usr/src/

COPY . .
RUN pip install -r requirements.txt

EXPOSE 5000

# CMD ["flask", "run", "--host=[0.0.0.0]"]
CMD ["python", "-m", "flask", "run", "--host=0.0.0.0"]