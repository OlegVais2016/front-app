export default class User {
  private _id: string;
  private _firstName: string;
  private _lastName: string;
  private _age: number;

  constructor(id: string, firstName: string, lastName: string, age: number) {
    this._id = id;
    this._firstName = firstName;
    this._lastName = lastName;
    this._age = age;
  }

  get id(): string {
    return this._id;
  }

  set id(value: string) {
    this._id = value;
  }

  get firstName(): string {
    return this._firstName;
  }

  set firstName(value: string) {
    this._firstName = value;
  }

  get lastName(): string {
    return this._lastName;
  }

  set lastName(value: string) {
    this._lastName = value;
  }

  get age(): number {
    return this._age;
  }

  set age(value: number) {
    this._age = value;
  }
}
